package hbcu.stay.ready.baronsfarm;

public class Egg extends Produce {
    @Override
    public Edible yield() {
        if(this.hasBeenFertilized){
            return null;
        }
        return this;
    }
}
