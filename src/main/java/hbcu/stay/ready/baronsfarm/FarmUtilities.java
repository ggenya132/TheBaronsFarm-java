package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class FarmUtilities {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static int getTotalAmountOfHorses(ArrayList<Stable> stables){
       return stables.stream().mapToInt(stable -> stable.getHorses().size()).sum();
    }
    public static int getTotalAmountOfChickens(ArrayList<ChickenCoop> chickenCoops){
        return chickenCoops.stream().mapToInt(chickenCoop -> chickenCoop.getChickens().size()).sum();
    }
}
