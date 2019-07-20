package dao;

import model.Item;

import java.util.Collection;

public interface ItemDAO {
    void addItem(Item item);
    void updateItem(Item item);
    Item getItemById(Long id);
    Collection<Item> getAllItems();
    void deleteItem(Item item);
}
