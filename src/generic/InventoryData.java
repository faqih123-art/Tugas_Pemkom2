/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class InventoryData {
    private List<Inventory<?>> inventoryList = new ArrayList<>();

    public void addItem(Inventory<?> item) {
        inventoryList.add(item);
    }

    public List<? extends Inventory<?>> getInventoryList() {
        return inventoryList;
    }

    public void removeItem(int index) {
        if (index >= 0 && index < inventoryList.size()) {
            inventoryList.remove(index);
        }
    }

    public Inventory<?> findItemByName(String name) {
        for (Inventory<?> item : inventoryList) {
            if (item.getNama().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null; // Jika tidak ditemukan
    }

    public void clearInventory() {
        inventoryList.clear();
    }
    
}
