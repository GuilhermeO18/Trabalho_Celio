package dao;

import java.util.ArrayList;
import model.VendaProdutoModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class VendaProdutoDao implements GenericDao<VendaProdutoModel> {

    @Override
    public void incluir(VendaProdutoModel vendaProduto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(vendaProduto);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(VendaProdutoModel vendaProduto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(vendaProduto);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<VendaProdutoModel> consultar(String filtro) {
        String sql = "from " + VendaProdutoModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<VendaProdutoModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(VendaProdutoModel vendaProduto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(vendaProduto);
        t.commit();
        session.close();
    }

    @Override
    public VendaProdutoModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (VendaProdutoModel) session.load(VendaProdutoModel.class, id);
    }
}
