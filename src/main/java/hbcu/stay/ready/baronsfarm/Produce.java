package hbcu.stay.ready.baronsfarm;

public class Produce implements Edible {
    boolean hasBeenFertilized;

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Edible yield() {
        if(hasBeenFertilized){
            return this;
        }
        return null;
    }
}
