package lesson170624;

import java.util.ArrayList;
import java.util.Random;

public class Imports {
    public static void main(String[] args) {
        System.out.println("");
//        java.util.Random rnd = new java.util.Random();
        Random rnd = new Random();
        ArrayList list = new ArrayList();

        System.out.println(ArrayList.class.getName());
    }
}
