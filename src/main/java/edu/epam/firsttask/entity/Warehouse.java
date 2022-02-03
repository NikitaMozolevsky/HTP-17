package edu.epam.firsttask.entity;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private static Warehouse warehouse = new Warehouse();
    private static Map<Integer, CircleStatistics> map = new HashMap<>();

    public static void setWarehouse(Warehouse warehouse) {
        Warehouse.warehouse = warehouse;
    }

    public static Map<Integer, CircleStatistics> getMap() {
        return map;
    }

    public static void setMap(Map<Integer, CircleStatistics> map) {
        Warehouse.map = map;
    }

    private Warehouse() {
    }

    public static Warehouse getInstance() {
        return warehouse;
    }

    public static CircleStatistics put(Integer key, CircleStatistics value) {
        return getMap().put(key, value);
    }

    public static CircleStatistics remove(Object key) {
        return getMap().remove(key);
    }

    public CircleStatistics get(Integer key) {
        return map.get(key);
    }

    public CircleStatistics replace(Integer key, CircleStatistics value) {
        return map.replace(key, value);
    }
}
