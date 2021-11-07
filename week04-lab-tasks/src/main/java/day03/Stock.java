package day03;

import java.util.Arrays;
import java.util.List;

public class Stock {
    private List<Double> doubleList;
    private int steps = 0;

    public Stock(List<Double> doubleList) {
        this.doubleList = doubleList;
    }

    public double maxProfit(){
        double numberMaxdiff = 0.0;
        double firstN = 0.0;
        double secondN = 0.0;
        for(int u = 0; u<doubleList.size();u++){
            if(firstN > doubleList.get(u)){
                numberMaxdiff = checkDailyDifferences(numberMaxdiff,u,secondN);
            }
            else{
                firstN = doubleList.get(u);
            }
        }
        System.out.println(steps);
        return numberMaxdiff;
    }

    public double checkDailyDifferences(double numberMaxdiff, int u, double secondN){
        for(int k = u +1; k<doubleList.size();k++){
            if(secondN < doubleList.get(k)){
                double diff = doubleList.get(k)-doubleList.get(u);
                steps++;
                if(diff>numberMaxdiff){
                    numberMaxdiff = diff;
                }
            }else{
                secondN = doubleList.get(k);
            }
        }
        return numberMaxdiff;
    }

    public static void main(String[] args) {
        Stock stock = new Stock(Arrays.asList(1.23,4.35,0.23,4.0,8.4));
        System.out.println(stock.maxProfit());

        Stock stock2 = new Stock(Arrays.asList(12.0,2.0,8.0,4.0,1.23,12.0, 4.35,0.23,4.0,8.4));
        System.out.println(stock2.maxProfit());
    }
}