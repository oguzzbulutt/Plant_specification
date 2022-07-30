public class TuberPlant extends Vegetables{

    public double tuberSize=0;
    public double waterMultiplier=1;

    public TuberPlant(String name, String color, double height, double radius, double waterRate,double tuber, double multiplier) {
        super(name, color, height, radius, waterRate);
        tuberSize = tuber;
        waterMultiplier = multiplier;
    }
    public void setTuberSize(double size){
        tuberSize = size;
    }

    @Override
    public String toString() {
        return "TuberPlant class runs now..." +"\n"+
                "Name: "+name+"\n"+
                "Color: " + color +"\n"+
                "Size= " + tuberSize +"\n"+
                "Radius= " + radius +"\n"+
                "Height= " + height +"\n"+
                "Water consumption= "+ waterNeed()*waterMultiplier+" liters";
    }
}
