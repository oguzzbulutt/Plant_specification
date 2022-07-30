public class Vegetables {

    public String name;
    public String color;
    public double radius=0;
    public double height=0;

    private double waterRate=0;

    public double getVegetableWaterRate() {
        return waterRate;
    }

    public double waterNeed(){

        double waterUsage= (height * radius)*waterRate;
        return waterUsage;
    }

    public Vegetables(String name, String color, double height, double radius, double waterRate) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.radius = radius;
        this.waterRate = waterRate;
    }

    @Override
    public String toString() {
        return "Vegetable class runs now..." +"\n"+
                "Vegetable name: " + name + "\n" +
                "Vegetable color: " + color + "\n" +
                "Vegetable radius: " + radius +" meters"+"\n"+
                "Vegetable height: " + height +" meters"+"\n"+
                "Water usage: "+ waterNeed()+" liters";
    }
}
