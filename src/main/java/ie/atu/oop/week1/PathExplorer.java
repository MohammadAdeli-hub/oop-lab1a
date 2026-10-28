package ie.atu.oop.week1;

import java.nio.file.Files;
import java.nio.file.Path;

public class PathExplorer
{
    public static void main(String[] args) {
        Path file = Path.of("data", "Books.csv");
        System.out.println("Path:"+ file);
        System.out.println("File:"+file.getFileName());
        System.out.println("Parrent:"+file.getParent());
        System.out.println("Absolute Path"+file.toAbsolutePath());
        System.out.println("Exist :"+ Files.exists(file));

    }
}
