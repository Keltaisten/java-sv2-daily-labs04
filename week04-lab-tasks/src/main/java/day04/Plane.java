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

    public int numberOfPackages(){
        int k = 0;
        for(int i = 0; i<pass.size();i++){
            k += pass.get(i).getBaggageAmount();
        }
        return k;
    }
}
