package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.abstracts.Crop;

import java.util.ArrayList;

public class CropRow<T extends  Crop> {
    ArrayList<T> cropList;
    boolean hasBeenFertilized = false;

    public CropRow(ArrayList<T> cropList) {
        this.cropList = cropList;
    }

    public CropRow(){
        cropList = new ArrayList<>();
    }
    public boolean hasBeenFertilized(){
        if(this.hasBeenFertilized){
            return true;
        }else{
            return false;
        }
    }

    public void fertilize(CropDuster cropDuster){
        if(cropDuster == null) {
            throw new RuntimeException("You need a cropDuster to fertilize");
        }
       cropList.forEach(Crop::fertilize);
    }
}
