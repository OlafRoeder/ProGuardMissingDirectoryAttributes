package application;

import java.net.URL;

public class Main {

    public static void main(String[] args) {

        String directory = "testDirectory";
        URL testDirectory = Main.class.getResource(directory);

        System.out.println("Testing file attributes, following line should show the URL to a directory 'testDirectory'");
        System.out.println(testDirectory.toExternalForm());
    }
}
