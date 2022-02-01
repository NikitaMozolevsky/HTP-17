package edu.epam.firsttask.entity;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private static Warehouse warehouse = new Warehouse();
    private static Map<Integer, ShapeStatistics> map = new HashMap<>();

    public static void setWarehouse(Warehouse warehouse) {
        Warehouse.warehouse = warehouse;
    }

    public static Map<Integer, ShapeStatistics> getMap() {
        return map;
    }

    public static void setMap(Map<Integer, ShapeStatistics> map) {
        Warehouse.map = map;
    }

    private Warehouse() {
    }

    public static Warehouse getWarehouse() {
        return warehouse;
    }

    public ShapeStatistics get(Integer key) {
        return map.get(key);
    }

    public ShapeStatistics replace(Integer key, ShapeStatistics value) {
        return map.replace(key, value);
    }
}
