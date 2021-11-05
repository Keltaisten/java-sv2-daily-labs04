package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int maxCapacity;
    private List<Passanger> pass = new ArrayList<>();

    public boolean addPassanger(Passanger passanger){
        if(maxCapacity>0){
            pass.add(passanger);
        }else{
            return false;
        }
        maxCapacity--;

        return true;
    }

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

//    public static void main(String[] args) {
//        Plane plane = new Plane(3);
//        Passanger passanger = new Passanger("John", "sadasd",4);
//        Passanger passanger2 = new Passanger("John", "sadasd",4);
//        Passanger passanger3 = new Passanger("John", "sadasd",4);
//        Passanger passanger4 = new Passanger("John", "sadasd",4);
//        System.out.println(plane.addPassanger(passanger));
//        System.out.println(plane.addPassanger(passanger2));
//        System.out.println(plane.addPassanger(passanger3));
//        System.out.println(plane.addPassanger(passanger4));
//    }

    public int numberOfPackages(){
        int k = 0;
        for(int i = 0; i<pass.size();i++){
            k += pass.get(i).getBaggageAmount();
        }
        return k;
    }
}
