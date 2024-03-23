package com.example.lab4;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    private List<Item> items = new ArrayList<>();


    public boolean addItem(Item item) {
        items.add(item);
        return true;
    }

    public void updateItem(int id, String newName) {
        for (Item item : items) {
            if (item.getId() == id) {
                item.setName((newName));
                break;
            }
        }
    }

    public boolean deleteItem(int id) {
        if (id >= 1 && id <= 20) {
            items.removeIf(item -> item.getId() == id);
            System.out.println("Xóa thành công!");
            return true;

        }else {
            System.out.println("ID không hợp lệ!");
        }
        return false;
    }

    public List<Item> getItems() {
        return items;
    }
}
