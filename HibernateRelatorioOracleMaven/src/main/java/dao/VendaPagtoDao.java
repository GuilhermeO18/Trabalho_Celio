package dao;

import java.util.ArrayList;
import model.VendaPagtoModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class VendaPagtoDao implements GenericDao<VendaPagtoModel> {

    @Override
    public void incluir(VendaPagtoModel vendaPagto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(vendaPagto);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(VendaPagtoModel vendaPagto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(vendaPagto);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<VendaPagtoModel> consultar(String filtro) {
        String sql = "from " + VendaPagtoModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<VendaPagtoModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(VendaPagtoModel vendaPagto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(vendaPagto);
        t.commit();
        session.close();
    }

    @Override
    public VendaPagtoModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (VendaPagtoModel) session.load(VendaPagtoModel.class, id);
    }
}
