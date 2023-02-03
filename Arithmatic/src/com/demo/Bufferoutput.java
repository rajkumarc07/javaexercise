package com.demo;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Bufferoutput {
    public static void main(String[] args) {
        try {
            FileOutputStream fos =
                    new FileOutputStream("C:\\Users\\Rajkumar\\IdeaProjects\\raj first project\\src\\com\\demo\\new.txt");

            //Creating BufferedOutputStream object.
            BufferedOutputStream bos =
                    new BufferedOutputStream(fos);

            bos.close();
            System.out.println("Sivakasi is also called as a Little Japan");
        }catch(Exception e){
            System.out.println("Ioexception:"+e.getMessage());
        }
    }
}
