<<<<<<< HEAD
package Jobsheet1.Percobaan1;
=======
package Percobaan1;
>>>>>>> 1e326c1d84a44d330810d16777f5d3579c567cce

public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();

        mountainBike1.setBrand("Trek");
        mountainBike1.gearChanges(5);
        mountainBike1.speedAcceleration(65);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.gearChanges(3);
        mountainBike2.speedAcceleration(20);
        mountainBike2.printInfo();

        roadBike1. setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.gearChanges(4);
        roadBike1.speedAcceleration(15);
        roadBike1.printInfo();
    }
}
