public class Grasses {
    public String name;
    public String typeOfGrass;
    public String growingSeason;
    public double waterUsage= 0;
    public double height= 0;
    public double radius= 0;

    public double waterRate= 1;

    public Grasses(String name, String typeOfGrass, String growingSeason,
                   double height, double radius, double waterRate){
        this.name = name;
        this.typeOfGrass = typeOfGrass;
        this.growingSeason = growingSeason;
        this.height = height;
        this.radius = radius;
        this.waterRate = waterRate;
    }

    public double waterConsumption(){
        waterUsage = (height*radius)*waterRate*waterRate;
        return waterUsage;
    }

    @Override
    public String toString() {
        return "Grasses class runs now..." +"\n"+
                "Name: " + name +"\n"+
                "Type: " + typeOfGrass +"\n"+
                "Growing season: " + growingSeason +"\n"+
                "Height: " + height +"\n"+
                "Radius: " + radius +"\n"+
                "Water rate: " + waterRate +"\n"+
                "Water usage: " + waterConsumption()+" liters";
    }
}
