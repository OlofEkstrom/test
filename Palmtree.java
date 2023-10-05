package Övning1;

public class Palmtree extends Plants implements Water{

    //Inkapsling
    private String typeOfWater = "kranvatten";
    private double amountOfWater = 0.5;

    public Palmtree(String namn, String type, double height) {
        super(namn, type, height);
    }

    private String getTypeOfWater(){
        return typeOfWater;
    }


    @Override
    public double totalWater1(double amountOfWater, double height) {
        return amountOfWater * height;
    }


    public double totalWater2(double a, double b, double c) {
        return 0;
    }

    //Polymorfism
    public String toString() {
        return "Palmen " + getName() + ", som är " + getHeight() + "m hög, ska ha " +
                totalWater1(amountOfWater, height) + " liter vatten av typen " + getTypeOfWater();
    }

}
