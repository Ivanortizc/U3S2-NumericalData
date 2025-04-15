package com.codedifferently.lab.partA;

public class Chickens01 {
    //Put your code here
    public static void main(String[] args) {
        int eggsPerChicken = 5;
        int chickenCount = 3;

        int mondayEggs = chickenCount * eggsPerChicken;
        int tuesdayEggs = (chickenCount + 1) * eggsPerChicken;
        int wednesdayChickens = (chickenCount + 1) / 2;
        int wednesdayEggs = wednesdayChickens * eggsPerChicken;
        int totalEggs = mondayEggs + tuesdayEggs + wednesdayEggs;
        System.out.println("Scenario 1 Total eggs:" + totalEggs);

        eggsPerChicken = 4;
        chickenCount = 8;

        mondayEggs = chickenCount * eggsPerChicken;

        tuesdayEggs = (chickenCount + 1) * eggsPerChicken;

        wednesdayChickens = (chickenCount + 1) / 2;
        wednesdayEggs = wednesdayChickens * eggsPerChicken;

        totalEggs = mondayEggs + tuesdayEggs + wednesdayEggs;
        System.out.println("Scenario 2 Total Eggs:" + totalEggs);
    }
    }


