package Övning1;

public class Cactus extends Plants implements Water{

    //Inkapsling
    private String typeOfWater = "mineralvatten";

    private double  amountOfWater = 0.02;
    private double multiplier = 1;
    public Cactus(String namn, String type, double height) {
        super(namn, type, height);
    }

    private String getTypeOfWater(){
        return typeOfWater;
    }

    @Override
    public double totalWater1(double amountOfWater, double multiplier) {
        return amountOfWater * multiplier;
    }

    public double totalWater2(double a, double b, double c) {
        return 0;
    }


    //Polymorfism
    public String toString() {
        return "Kaktusen " + getName() + ", som är " + getHeight() + "m hög, ska ha " +
                totalWater1(amountOfWater, multiplier) + " liter vatten av typen " + getTypeOfWater();
    }
}
