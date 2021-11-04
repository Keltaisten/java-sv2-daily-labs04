package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stock {
    private List<Double> doubleList;

    public Stock(List<Double> doubleList) {
        this.doubleList = doubleList;
    }

    public double maxProfit(){
        double numberMax = doubleList.get(0);
        double numberMin = doubleList.get(0);
        for(int i = 1; i<doubleList.size();i++){
            if(doubleList.get(i)>numberMax){
                numberMax = doubleList.get(i);
            }else if(doubleList.get(i)<numberMin){
                numberMin = doubleList.get(i);
            }
        }

        double result = numberMax-numberMin;

        double numberMaxdiff = 0;
        for(int u = 0; u<doubleList.size();u++){
            for(int k = u +1; k<doubleList.size();k++){
                if(doubleList.get(k)-doubleList.get(u)>numberMaxdiff){
                    numberMaxdiff = doubleList.get(k)-doubleList.get(u);
                }
            }
        }

        return numberMaxdiff;
    }

    public static void main(String[] args) {
        Stock stock = new Stock(Arrays.asList(1.23,4.35,0.23,4.0,8.4));
        System.out.println(stock.maxProfit());

        Stock stock2 = new Stock(Arrays.asList(12.0,2.0,8.0,4.0));
        System.out.println(stock2.maxProfit());
    }
}
