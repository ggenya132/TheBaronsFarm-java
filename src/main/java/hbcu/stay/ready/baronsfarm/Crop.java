package hbcu.stay.ready.baronsfarm;

public abstract class Crop<T extends Produce> {
    private boolean hasBeenHarvested;
    protected T produce;
    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }


    public T getProduce() {
        return produce;
    }

    public Edible yield() {
     if(produce.isHasBeenFertilized() && !hasBeenHarvested){
        return produce.yield();
     }
     return null;
    }
}
