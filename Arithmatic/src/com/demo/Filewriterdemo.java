package com.demo;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Filewriterdemo {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("C:\\Users\\Rajkumar\\IdeaProjects\\raj first project\\src\\com\\demo\\data.txt");
            fw.write("hiii raj");
            fw.close();
            System.out.println("writting");
        } catch (FileNotFoundException fe ) {
            System.out.println("fileNotfoundexception: " + fe.getMessage());
        }catch (IOException ie) {
            System.out.println("IOexception: " + ie.getMessage());
        }


    }
}
