package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.abstracts.Crop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Field {
    ArrayList<CropRow> cropRows;
    public Field() {

        ArrayList<CornStalk> cornStalks = new ArrayList<>();
        cornStalks.add(new CornStalk( new EarCorn()));
        ArrayList<TomatoPlant> tomatoPlants = new ArrayList<>();
        tomatoPlants.add(new TomatoPlant( new Tomato()));
        CropRow<CornStalk> cornRow = new CropRow<>(cornStalks);
        CropRow<TomatoPlant> tomatoRow = new CropRow<>(tomatoPlants);

        cropRows = new ArrayList<>();

        cropRows.add(cornRow);
        cropRows.add(tomatoRow);

    }

}
