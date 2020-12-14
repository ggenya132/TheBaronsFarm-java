package hbcu.stay.ready.baronsfarm.abstracts;

import hbcu.stay.ready.baronsfarm.classes.*;
import hbcu.stay.ready.baronsfarm.interfaces.Produce;

import java.util.LinkedList;

public abstract class Crop<T extends Produce>   {
    Produce produce;
    boolean hasBeenHarvested ;

    public Edible yield(){
        if(!hasBeenHarvested && this.produce.hasBeenFertilized()){
            hasBeenHarvested = true;
            Edible yieldedEdible =  produce.yield();
            produce = null;
            return yieldedEdible;
        }
        return null;
    }

    public Crop(Produce produce){
        this.produce = produce;
    }
    public void fertilize(){
        produce.setHasBeenFertilized(true);
    }
}