package controller;

import model.Clientes;
import model.Familias;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;

public final class ClientesDAO {
    static private Session session;

    private ClientesDAO() {
    }

    public static void initOperation() {
        session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    }

    public static boolean removeCliente(Clientes cliente) {
        initOperation();
        boolean res = false;

        try {
            session.delete(cliente);
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

    public static boolean addCliente(Clientes clientes) {
        initOperation();

        boolean res = false;

        try {
            session.save(clientes);
            session.getTransaction().commit();
            res = true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }

        return res;
    }

    public static Familias getCliente(Clientes familia) {
        initOperation();
        Familias res = null;
        try {
            res = (Familias) session.get(Clientes.class, familia.getCodcli());
        } finally {
            session.close();
        }
        return res;
    }

    public static List<Clientes> getClientesList() {
        initOperation();

        List<Clientes> res;
        try {
            // noinspection unchecked
            res = (List<Clientes>) session.createCriteria(Clientes.class).list();
        } finally {
            session.close();
        }

        return res;
    }
}
