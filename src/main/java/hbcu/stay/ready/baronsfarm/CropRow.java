package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class CropRow<T extends Crop>{
    ArrayList<T> crops;
    public  CropRow(ArrayList<T> crops){
        this.crops = crops;
    }
    public CropRow(){
        crops = new ArrayList<>();
    }
    public void plant(T crop){
        crops.add(crop);
    }
    public void fertilize(CropDuster cropDuster){
        crops.forEach(crop -> crop.getProduce().setHasBeenFertilized(true));
    }

}
