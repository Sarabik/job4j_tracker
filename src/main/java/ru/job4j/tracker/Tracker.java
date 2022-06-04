package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                return index;
            }
        }
        return -1;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        Item[] itemsCopy = new Item[items.length];
        int index = 0;
        for (Item item : items) {
            if (item != null) {
                itemsCopy[index] = item;
                index++;
            }
        }
        return Arrays.copyOf(itemsCopy, index);
    }

    public Item[] findByName(String key) {
        Item[] itemsCopy = new Item[items.length];
        int index = 0;
        for (Item item : items) {
            if (item != null && key.equals(item.getName())) {
                itemsCopy[index] = item;
                index++;
            }
        }
        return Arrays.copyOf(itemsCopy, index);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index == -1) {
           return false;
        }
        item.setId(id);
        items[index] = item;
        return true;

    }
}