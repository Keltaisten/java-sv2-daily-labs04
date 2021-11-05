package day04;

public class PlaneMain {
    public static void main(String[] args) {
        Plane plane = new Plane(3);
        Passanger passanger = new Passanger("John", "sadasd",4);
        Passanger passanger2 = new Passanger("John", "sadasd",4);
        Passanger passanger3 = new Passanger("John", "sadasd",4);
        Passanger passanger4 = new Passanger("John", "sadasd",4);
        System.out.println(plane.addPassanger(passanger));
        System.out.println(plane.addPassanger(passanger2));
        System.out.println(plane.addPassanger(passanger3));
        System.out.println(plane.addPassanger(passanger4));
        PlaneMain planeMain = new PlaneMain();
        System.out.println(plane.numberOfPackages());

    }

//    public int numberOfPackages(){
//PlaneMain planeMain = new PlaneMain();
//        return 1;
//    }
}
