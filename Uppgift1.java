package Övning1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Uppgift1 {

    public int listLength;
    String[] plantArray = new String[1000];
    String input;
    int index;

    Uppgift1(){

        //Polymorfism
        Plants Igge = new Cactus("Igge", "kaktus", 0.2);
        Plants Laura = new Palmtree("Laura", "palm", 5.0);
        Plants Meatloaf = new Meateater("Meatloaf", "köttätande växt", 0.7);
        Plants Olof = new Palmtree("Olof", "palm", 1.0);
        Plants Örjan = new Cactus("Örjan", "kaktus", 0.3);
        Plants Eddie = new Meateater("Eddie", "köttätande växt", 0.4);
        Plants Fredrika = new Palmtree("Fredrika", "palm", 2.4);

        List<Plants> allplants = new ArrayList<>();
        allplants.add(Igge);
        allplants.add(Laura);
        allplants.add(Meatloaf);
        allplants.add(Olof);
        allplants.add(Örjan);
        allplants.add(Eddie);
        allplants.add(Fredrika);


        listLength = allplants.size();
        printPlants(allplants);
        choosePlant(allplants);


    }

    public void printPlants(List<Plants> allplants){

        String[] temparray = new String[listLength];
        int ii = 0;
        for (Plants p : allplants){
            plantArray[ii] = p.getName() + "\n";
            temparray[ii] = "Växten: " + p.getName() + " som är en " + p.getType() + "\n";
            ii++;
        }
        input = JOptionPane.showInputDialog("Vilken växt vill du få information om: \n" + Arrays.toString(temparray));
    }

    public void choosePlant(List<Plants> allplants){
        boolean plantExist = false;
        for (int i = 0; i < listLength; i++) {
            if(plantArray[i].contains(input)){
                index = i;
                plantExist = true;
            }
        }
        if(plantExist == false){
            JOptionPane.showMessageDialog(null, "Finns ingen växt med det namnet i hotellet.");
        }
        else{
            String output = String.valueOf(allplants.get(index));
            JOptionPane.showMessageDialog(null, output);
        }




    }


    public static void main(String[] args){
        Uppgift1 uppgift1 = new Uppgift1();



    }
}
