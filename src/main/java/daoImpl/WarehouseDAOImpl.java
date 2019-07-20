package daoImpl;

import dao.WarehouseDAO;
import model.Warehouse;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.Collection;
import java.util.List;

public class WarehouseDAOImpl implements WarehouseDAO {

    private Session session;

    public WarehouseDAOImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public void addWarehouse(Warehouse warehouse) {
        session.beginTransaction();
        session.save(warehouse);
        session.getTransaction().commit();
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) {
        session.beginTransaction();
        session.update(warehouse);
        session.getTransaction().commit();
    }

    @Override
    public Warehouse getWarehouseById(Long id) {
        Warehouse warehouse = session.load(Warehouse.class, id);
        return warehouse;
    }

    @Override
    public Collection<Warehouse> getAllWarehouses() {
        List<Warehouse> warehouses = session.createCriteria(Warehouse.class).list();
        return warehouses;
    }

    @Override
    public void deleteWarehouse(Warehouse warehouse) {
        session.beginTransaction();
        session.delete(warehouse);
        session.getTransaction().commit();
    }
}
