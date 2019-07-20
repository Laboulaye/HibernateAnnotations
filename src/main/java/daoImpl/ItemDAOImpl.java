package daoImpl;

import dao.ItemDAO;
import model.Item;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ItemDAOImpl implements ItemDAO {

    private Session session;

    public ItemDAOImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public void addItem(Item item) {
        session.beginTransaction();
        session.save(item);
        session.getTransaction().commit();
    }

    @Override
    public void updateItem(Item item) {
        session.beginTransaction();
        session.update(item);
        session.getTransaction().commit();
    }

    @Override
    public Item getItemById(Long id) {
        Item item = session.load(Item.class, id);
        return item;
    }

    @Override
    public Collection<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        items = session.createCriteria(Item.class).list();
        return items;
    }

    @Override
    public void deleteItem(Item item) {
        session.beginTransaction();
        session.delete(item);
        session.getTransaction().commit();
    }
}
