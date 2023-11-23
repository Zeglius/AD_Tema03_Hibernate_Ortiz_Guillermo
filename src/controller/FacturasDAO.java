package controller;

import model.Facturas;
import model.LineasFacturas;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;

public final class FacturasDAO {
    static private Session session;

    private FacturasDAO() {
    }

    public static void initOperation() {
        session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    }

    public static boolean removeFactura(Facturas factura) {
        initOperation();
        boolean res = false;


        try {
            session.delete(factura);
            session.getTransaction().commit();
            res = true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            res = false;
        } finally {
            session.close();
        }

        return res;
    }

    public static boolean removeLineaFactura(LineasFacturas lineasFactura) {
        boolean res = false;
        initOperation();

        try {
            session.delete(lineasFactura);
            session.getTransaction().commit();
            res = true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }

        return res;
    }

    public static boolean addFactura(Facturas factura) {
        initOperation();

        boolean res = false;

        try {
            session.save(factura);
            session.getTransaction().commit();
            res = true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }

        return res;
    }

    public static List<Facturas> getFacturaList() {
        initOperation();

        List<Facturas> res;
        try {
            // noinspection unchecked
            res = (List<Facturas>) session.createCriteria(Facturas.class).list();
        } finally {
            session.close();
        }

        return res;
    }

    public static Facturas getFactura(String numfac) {
        initOperation();
        Facturas res = null;
        try {
            res = (Facturas) session.get(Facturas.class, numfac);
        } finally {
            session.close();
        }
        return res;
    }
}
