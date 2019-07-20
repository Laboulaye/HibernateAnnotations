package com.study;

import dao.ItemDAO;
import dao.ProviderDAO;
import dao.WarehouseDAO;
import daoImpl.ItemDAOImpl;
import daoImpl.ProviderDAOImpl;
import daoImpl.WarehouseDAOImpl;

public class Factory {

    private static Factory instance;
    private static ItemDAO itemDAO;
    private static ProviderDAO providerDAO;
    private static WarehouseDAO warehouseDAO;

    public static synchronized Factory getInstance(){
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public static ItemDAO getItemDAO() {
        if (itemDAO == null) {
            itemDAO = new ItemDAOImpl();
        }
        return itemDAO;
    }

    public static ProviderDAO getProviderDAO() {
        if (providerDAO == null) {
            providerDAO = new ProviderDAOImpl();
        }
        return providerDAO;
    }

    public static WarehouseDAO getWarehouseDAO() {
        if (warehouseDAO == null) {
            warehouseDAO = new WarehouseDAOImpl();
        }
        return warehouseDAO;
    }
}
