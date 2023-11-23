package controller;

import model.Articulos;
import model.Familias;
import org.hibernate.HibernateException;
import org.hibernate.LazyInitializationException;
import org.hibernate.Session;
import org.hibernate.collection.internal.PersistentSet;

import java.util.List;
import java.util.Set;

public final class FamiliasDAO {
    static private Session session;

    private FamiliasDAO() {
    }

    public static void initOperation() {
        session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    }

    public static boolean removeFamilia(Familias familia) {
        initOperation();

        try {
            session.delete(familia);
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

    public static boolean addFamilia(Familias familia) {
        initOperation();

        try {
            session.save(familia);
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

    public static Set<Articulos> getFamiliaArticulos(Familias familia) {
        Set<Articulos> res = null;
        initOperation();

        try {
            // FIXME: 23/11/23 getArticuloses() results in a LazyInitializationError???
            res = ((Set<Articulos>) familia.getArticuloses());
            assert !res.isEmpty();
        } catch (LazyInitializationException e) {
            throw new RuntimeException(e);
        } finally {
            session.close();
        }

        return res;
    }

    public static List<Familias> getFamilias() {
        initOperation();

        List<Familias> res;
        try {
            // noinspection unchecked
            res = (List<Familias>) session.createCriteria(Familias.class).list();
        } finally {
            session.close();
        }

        return res;
    }
}
