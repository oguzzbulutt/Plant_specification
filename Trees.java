public class Trees {

    public String name;
    public String typeOfTree;
    public double height=0;
    public double radius=0;
    public double waterRate=0;


    public String getTreeName() {

        return name;
    }

    public Trees(String name, String typeOfTree, double height, double radius, double waterRate) {
        this.name = name;
        this.typeOfTree = typeOfTree;
        this.height = height;
        this.radius = radius;
        this.waterRate = waterRate;
    }

    public double waterNeed(){
        double usage=(height*radius)*waterRate;
        return usage;
    }
    @Override
    public String toString() {
        return "Tree class runs now..." +"\n"+
                "Type of tree: "+ typeOfTree+"\n"+
                "Tree name: " + name +"\n"+
                "Tree radius: " + radius +" meters"+"\n"+
                "Tree height: " + height +" meters"+"\n"+
                "Water consumption: "+waterNeed();
    }
}
