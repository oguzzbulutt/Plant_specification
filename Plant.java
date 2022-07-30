public class Plant {
    public static void main(String[] args){
        Vegetables  tomato  = new Vegetables("Tomato", "red", 0.6, 1, 2);
        Trees       apple   = new Trees("Apple", "Fruit",1, 2.20, 3);
        TuberPlant  patato  = new TuberPlant("Patato", "Yellow", 0.4, 0.2, 5, 4.7, 3.75);
        Trees       pine    = new Trees("Pine", "Coniferous", 30.5, 20.3, 15.7);
//      Grasses     ayrik   = new Grasses("Ayrik", "Savage", "All year",0.1, 0.6,5);

        Vegetables  ispanak = new Vegetables("Ispanak", "Yeşil",0.2, 10, 1);
        Trees       cam     = new Trees("cam", "İgne yaprakli", 10, 1, 150);
        TuberPlant  turp    = new TuberPlant("Turp", "siyah",0.15,0.2,3.5,1,3);
        Grasses     ayrik   = new Grasses("Ayrik", "Istilaci", "Her mevsim",0.1,2, 10);

        System.out.println(ispanak.toString());
        System.out.println();
        System.out.println(cam.toString());
        System.out.println();
        System.out.println(turp.toString());
        System.out.println();
        System.out.println(ayrik.toString());



//        System.out.println(tomato.toString());
//
//        System.out.println();
//        System.out.println(apple.toString());
//
//        System.out.println();
//        System.out.println(tomato.toString());
//
//        System.out.println();
//        System.out.println(patato.toString());
//
//        System.out.println();
//        System.out.println(pine.toString());
//
//        System.out.println();
//        System.out.println(ayrik.toString());

    }
}