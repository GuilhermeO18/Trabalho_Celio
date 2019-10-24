package dao;

import java.util.ArrayList;
import model.CompraProdutoModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class CompraProdutoDao implements GenericDao<CompraProdutoModel> {

    @Override
    public void incluir(CompraProdutoModel compraProduto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(compraProduto);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(CompraProdutoModel compraProduto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(compraProduto);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<CompraProdutoModel> consultar(String filtro) {
        String sql = "from " + CompraProdutoModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<CompraProdutoModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(CompraProdutoModel compraProduto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(compraProduto);
        t.commit();
        session.close();
    }

    @Override
    public CompraProdutoModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (CompraProdutoModel) session.load(CompraProdutoModel.class, id);
    }
}
