package ru.job4j.poly;

public class VehicleExample {
    public static void main(String[] args) {

        Vehicle airplane1 = new Airplane();
        Vehicle airplane2 = new Airplane();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle bus1 = new BusNew();
        Vehicle bus2 = new BusNew();
        Vehicle bus3 = new BusNew();
        Vehicle[] vehicles = {train1, airplane2, bus1, bus2, airplane1, train2, bus3};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
