package challenge01;

import java.util.Scanner;

public class example01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Input
        System.out.print("What is your name? ");
        String name = in.nextLine();


        String outputString = "Hello, " + name + ", nice to meet you!";

        System.out.println(outputString);



    }

}
