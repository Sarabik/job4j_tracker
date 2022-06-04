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

    public Item findById(int id) {
        for (Item item : items) {
            if (id == item.getId()) {
                return item;
            }
        }
        return null;
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
}