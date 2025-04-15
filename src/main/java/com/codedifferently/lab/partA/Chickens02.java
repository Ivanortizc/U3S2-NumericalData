package com.codedifferently.lab.partA;

public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
        int mondayEggs = 100;
        int tuesdayEggs = 121;
        int wednesdayEggs = 117;

        int totalEggs = mondayEggs +tuesdayEggs+ wednesdayEggs;
        double dailyAverage = totalEggs/3.0;

        double monthlyAverage = dailyAverage *30;

        double profitPerEggs = 0.18;
        double monthlyProfit = monthlyAverage * profitPerEggs;

        System.out.println("Daily Average: "+ dailyAverage);
        System.out.println("Monthly Average: "+monthlyAverage);
        System.out.println("Monthly Profit: $"+ monthlyProfit);


        //System.out.println("Daily Average:   " +dailyAverage);
        //System.out.println("Monthly Average: " +monthlyAverage);
        //System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
}
