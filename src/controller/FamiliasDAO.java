package controller;

import model.Articulos;
import model.Familias;
import org.hibernate.HibernateException;
import org.hibernate.LazyInitializationException;
import org.hibernate.Session;

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

        boolean res = false;

        try {
            session.save(familia);
            session.getTransaction().commit();
            res = true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }

        return res;
    }

    public static Set<Articulos> getFamiliaArticulos(Familias familia) {
        Set<Articulos> res = null;
        initOperation();

        try {
            res = ((Set<Articulos>) familia.getArticuloses());
        } catch (LazyInitializationException e) {
            throw new RuntimeException(e);
        } finally {
            session.close();
        }

        return res;
    }

    public static boolean addArticuloToFamilia(Articulos articulo, Familias familia) {
        boolean res = false;
        initOperation();

        try {
            addArticulo:
            {
                if (familia.getArticuloses().contains(articulo)) {
                    res = false;
                    break addArticulo;
                }

                session.save(articulo);
                session.getTransaction().commit();
                res = true;
            }
        } finally {
            session.close();
        }

        return res;
    }

    public static boolean removeArticuloFromFamilia(Articulos articulo) {
        initOperation();

        // noinspection UnusedAssignment
        boolean res = false;
        try {
            session.delete(articulo);
            session.getTransaction().commit();
            res = true;
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

    public static  Familias getFamilia(Familias familia) {
        initOperation();
        Familias res = null;
        try {
            res = (Familias) session.get(Familias.class, familia.getCodfam());
        } finally {
            session.close();
        }
        return res;
    }
}
