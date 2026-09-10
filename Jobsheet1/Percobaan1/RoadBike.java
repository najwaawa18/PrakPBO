<<<<<<< HEAD
package Jobsheet1.Percobaan1;
=======
package Percobaan1;
>>>>>>> 1e326c1d84a44d330810d16777f5d3579c567cce

public class RoadBike extends Bike {
    private int tireWidth;

    public void setTireWidth(int width) {
        tireWidth = width;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tire Width : " + tireWidth + " mm");
        System.out.println("Bike Type : Road Bike");
        System.out.println("------------------------");
    }
}