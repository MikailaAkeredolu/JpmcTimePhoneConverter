package io.akeredolu;
import java.util.Scanner;

/**
 * Created by mikailaakeredolu on 6/8/16.
 */
public class UserInput {

    String number = " ";

    public String userPrompt(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");

        number = input.next();

        return number;
    }
}


