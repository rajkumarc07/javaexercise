package com.demo;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Arraylistdemo {
    public static void main(String[] args){
        try {
            List arraylist  = new ArrayList<String>();
            arraylist.add("Trisha");
            arraylist.add("Nayanthara");
            arraylist.add("Anushka");
            arraylist.add("Keerthy suresh");
            arraylist.add("Rashmika");
            List secondArrayList = new ArrayList();
            secondArrayList.addAll(arraylist);
            System.out.println("secondArrayList" + secondArrayList.size());
            System.out.println(arraylist);
            secondArrayList.add("Emi Jackshon");
            System.out.println("contains of second arraylist" + secondArrayList);
            System.out.println("secondary contains all" + secondArrayList.containsAll(arraylist));
            System.out.println(arraylist);
            System.out.println(arraylist.size());
            System.out.println((arraylist.contains("Anushka")) ? "true" : "false");
            System.out.println(arraylist.remove("Rashmika"));
            System.out.println(arraylist.size());
            System.out.println((arraylist.contains("Nayanthara")) ? "true" : "false");
            System.out.println((arraylist.get(0)));
            System.out.println(arraylist.get(2));
            System.out.println("Demonstrating" + arraylist.isEmpty());
        }catch (IndexOutOfBoundsException ie) {
            System.out.println("Index out of box" + ie.getMessage());
            System.out.println("Executed Successfully");
        }



    }

}