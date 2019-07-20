package dao;

import model.Warehouse;

import java.util.Collection;

public interface WarehouseDAO {
    void addWarehouse(Warehouse warehouse);
    void updateWarehouse(Warehouse warehouse);
    Warehouse getWarehouseById(Long id);
    Collection<Warehouse> getAllWarehouses();
    void deleteWarehouse(Warehouse warehouse);
}
