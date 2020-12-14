package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class Stable {
    ArrayList<Horse> horses;

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void setHorses(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    public void addHorses(Horse horse){
        horses.add(horse);
    }
    public Stable(){
        this.horses = new ArrayList<>();
    }
}
