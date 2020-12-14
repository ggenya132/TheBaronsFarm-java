package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;
import java.util.function.Function;

public class Farm {
    private static Farm farm;
    Field field;
    ArrayList<ChickenCoop> chickenCoops;
    ArrayList<Stable> stables;

    private final int AMOUNT_OF_CHICKEN_COOPS = 4;
    private final int AMOUNT_OF_CHICKENS = 15;
    private final int AMOUNT_OF_STABLES = 3;
    private final int AMOUNT_OF_HORSES = 10;
    private final int AMOUNT_OF_FARM_VEHICLES = 2;
    private final int AMOUNT_OF_AIRCRAFT = 1;

    private Farm(){
        randomlyAddChickens();
        randomlyAddHorses();

        //TODO: instantiate vehicles
    }

    public static Farm getInstance(){
        if(farm == null){
            farm = new Farm();
        }
        return farm;
    }

    private void randomlyAddHorses(){
        stables = new ArrayList<>();

        while(stables.size() < AMOUNT_OF_STABLES){
            stables.add(new Stable());
        }
        while(FarmUtilities.getTotalAmountOfHorses(stables) < AMOUNT_OF_HORSES) {
            int indexOfStable = FarmUtilities.getRandomNumber(0, AMOUNT_OF_STABLES);
            stables.get(indexOfStable).addHorses(new Horse());
        }

    }

    private void randomlyAddChickens(){
        chickenCoops = new ArrayList<>();
        while(chickenCoops.size() < AMOUNT_OF_CHICKEN_COOPS){
            chickenCoops.add(new ChickenCoop());
        }
        while(FarmUtilities.getTotalAmountOfChickens(chickenCoops)< AMOUNT_OF_CHICKENS) {
            int indexOfCoop = FarmUtilities.getRandomNumber(0, AMOUNT_OF_CHICKEN_COOPS);
            chickenCoops.get(indexOfCoop).addChicken(new Chicken());
        }

    }


}
