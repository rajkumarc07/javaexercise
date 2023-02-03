package com.demo;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Bufferinput {
    public static void main(String[] args) {

        try {
            //creating FileInputStream object.
            FileInputStream fis =
                    new FileInputStream( "C:\\Users\\Rajkumar\\IdeaProjects\\raj first project\\src\\com\\demo\\new.txt");

            //Creating BufferedInputStream object.
            BufferedInputStream bis =
                    new BufferedInputStream(fis);
            int i;
            //read file.
            while((i=bis.read())!=-1){
                System.out.print((char)i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
