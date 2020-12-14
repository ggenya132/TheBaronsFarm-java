package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class Field {
    ArrayList<CropRow<Crop>> cropRows;
    public Field(){
        cropRows = new ArrayList<>();
        CropRow<TomatoPlant> tomatoPlantCropRow = new CropRow<>();
        CropRow<CornStalk>  cornStalkCropRow = new CropRow<>();

        cornStalkCropRow.plant(new CornStalk());
        tomatoPlantCropRow.plant(new TomatoPlant());

        //TODO: ADD SOME MORE PLANTS
    }
}
