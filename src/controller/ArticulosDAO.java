package controller;

import model.Articulos;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;

/* TODO: 23/11/23 Should I remove this class and simply query articulos from FamiliasDAO?
 * NOTE: If I delete this, articulos queries need to be implemented (OR maybe not, who knows)?
 */
@Deprecated
public final class ArticulosDAO {
    static private Session session;

    private ArticulosDAO() {
    }

    public static void initOperation() {
        session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    }

    public static boolean removeArticulo(Articulos articulos) {
        initOperation();

        try {
            session.delete(articulos);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        } finally {
            session.close();
        }

        return true;
    }

    public static boolean addFamilia(Articulos articulos) {
        initOperation();

        try {
            session.save(articulos);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        } finally {
            session.close();
        }

        return true;
    }

    public static List<Articulos> getArticulos() {
        initOperation();

        List<Articulos> res;
        try {
            // noinspection unchecked
            res = (List<Articulos>) session.createCriteria(Articulos.class).list();
        } finally {
            session.close();
        }

        return res;
    }
}
