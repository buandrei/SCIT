package sci.inheritance;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.regex.Pattern;

public class ExamplesWithArrays {

    public static void main(String args[]) {
        // exampleWithIntArray();
        // exampleWithArrayObjects();
        exampleDeleteElementFromArray();
    }

    private static void exampleDeleteElementFromArray() {

        String[] sirString = {"a", "b", "c", "d", "e"};
        String[] newArrayCopy = new String[5];

        for (int i = 0; i < newArrayCopy.length; i++) {


            //i este par;
            // if (i%2 == 0)  MODULO : restul impartirii lui i la 2 este 0; daca este impar , restul != 0
            //stergem elementul de pe pozitia 3

            if (i != 2 && i < newArrayCopy.length ) {
                newArrayCopy[i] = sirString[i];
            }

          System.out.println("Pozitia " + i + " a sirului este " + newArrayCopy[i]);

        }
    }

    private static void exampleWithArrayObjects() {

        Shape[] objects = new Shape[5];

        objects[0] = new Circle();
        objects[1] = new Circle();
        objects[2] = new Triangle();
        objects[3] = new Rectangle();
        objects[4] = new Triangle();

        for (int i = 0; i < objects.length; i++) {

            System.out.println(objects[i].name);

        }


        //System.out.println(obiecte);


    }

    private static void exampleWithIntArray() {
        //Declaratie pentru sir de numere (array) , 5 din paranteza e lungimea sirului

        int[] sirDeNumiere = new int[5];

        //Completam sirul cu o valoare

        sirDeNumiere[0] = 5;
        sirDeNumiere[1] = 3;
        sirDeNumiere[2] = 8;

        for (int i = 0; i < sirDeNumiere.length; i++) {

            System.out.println("Valoare: " + sirDeNumiere[i]);

        }
        //Declaratie sir predefinit , e din 3 elemente cu valorile sale

        int[] sirNumerePredef = {3, 4, 8};
        System.out.println(sirNumerePredef[1]);
    }


}
