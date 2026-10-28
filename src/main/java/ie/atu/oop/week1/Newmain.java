package ie.atu.oop.week1;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Newmain
{
    public static void main(String[] args)
    {
        Path file =Path.of("data","Books.cvs");
        List <String> lines = new ArrayList<>();
        lines.add("title ,auther, pagcount, status");
        lines.add("Dune, FrankHerbert, 223,AVAILABLE");
        lines.add("Clean Code , Robert C, Martin,178,AVAILABLE");



            try {
                Files.createDirectories(file.getParent());
                Files.write(file,lines);
                System.out.println("File Created");

            } catch (IOException e)
            {
                System.out.println("file not created"+ e.getMessage());

            }


    }

}
