package Övning1;

public class Meateater extends Plants implements Water{

    //Inkapsling
    private String typeOfWater = "proteindryck";
    private double  amountOfWater = 0.2;
    private double baseWater = 0.1;
    public Meateater(String namn, String type, double height) {
        super(namn, type, height);
    }

    private String getTypeOfWater(){
        return typeOfWater;
    }

    public double totalWater1(double a, double b) {
        return 0;
    }

    @Override
    public double totalWater2(double amountOfWater, double height, double baseWater) {
        return (((amountOfWater*100) * (height*100)) + baseWater*10000)/10000;
    }

    //Polymorfism
    public String toString() {
        return "Den köttätande växten " + getName() + ", som är " + getHeight() + "m hög, ska ha " +
                totalWater2(amountOfWater, height, baseWater) + " liter vatten av typen " + getTypeOfWater();
    }

}
