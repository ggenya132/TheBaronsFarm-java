package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class ChickenCoop {
    ArrayList<Chicken> chickens;

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }
    public void addChicken(Chicken chicken){
        chickens.add(chicken);
    }

    public  ChickenCoop(){
        chickens = new ArrayList<>();
    }
}
