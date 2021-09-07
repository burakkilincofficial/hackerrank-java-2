package telenity;

import java.util.HashMap;

public class CropRatio {
    private int totalWeight;
    private HashMap<String, Integer> crops = new HashMap<>();

    public void add(String name, int cropWeight) {
        Integer currentCropWeight = crops.get(name);

        if (currentCropWeight == null) {
            crops.put(name, 1);
        }else{
            currentCropWeight += cropWeight;
            crops.put(name,currentCropWeight);
        }

        totalWeight++;
    }

    public double proportion(String name) {
        if(totalWeight==0){
            return 0d;
        }
        return (double)crops.get(name) / totalWeight;
    }

    public static void main(String[] args) {
        CropRatio cropRatio = new CropRatio();

        cropRatio.add("Wheat", 4);
        cropRatio.add("Wheat", 5);
        cropRatio.add("Rice", 1);

        System.out.println("Fraction of wheat: " + cropRatio.proportion("Wheat"));
    }
}