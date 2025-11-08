package inface2;

public class Ladoo implements Sweet {

    @Override
    public void prepare() {
        System.out.println("Preparing sweets");
    }

    @Override
    public void decorate() {
        System.out.println("Decorate it");
    }

    @Override
    public void serve() {
        serve("plate", "warm");
    }

    // PARAMETERIZED METHOD OF LADOO CLASS
    public void serve(String container, String temperature) {
        System.out.println("Serving  in a " + container + " at " + temperature + " temperature.");
    }
    // PARAMETERIZED METHOD
    public void shape(String shapeType, int size) {
        System.out.println("Shaping  into " + shapeType + " of size " + size + " cm.");
    }
   
}
