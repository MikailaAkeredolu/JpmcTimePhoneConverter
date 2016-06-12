package io.akeredolu;

import java.util.StringTokenizer;

/**
 * Created by mikailaakeredolu on 6/8/16.
 */
public class MilitaryTime {

    private String[] numbersArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
            "twenty", "twenty one", "twenty two", "twenty three"};

    public boolean isMilitaryTime(String number) {
        return number.matches("[0-2]\\d:[0-5]\\d");
    }

    public void printAsWords(String time) {
        StringTokenizer st = new StringTokenizer(time, ":");
        String hours = st.nextToken();
        String minutes = st.nextToken();
        printMilitaryHours(hours);
        printMilitaryMinutes(minutes);
    }

    public void printMilitaryHours(String hrs) {
        int converted = Integer.parseInt(hrs);
        char firstChar = hrs.charAt(0);
        if (firstChar == '0') {
            System.out.print("o ");
        }
        System.out.print(numbersArray[converted]);
    }

    public void printMilitaryMinutes(String mins) {
        char firstDigit = mins.charAt(0);
        char secondDigit = mins.charAt(1);
        int converted = -1;
        switch (firstDigit) {
            case '0':
                if (secondDigit == '0') {
                    System.out.print(" hundred");
                } else {
                    System.out.print(" o " + numbersArray[Integer.parseInt(String.valueOf(secondDigit))]);
                }
                break;
            case '1':
                converted = Integer.parseInt(mins);
                System.out.print(" " + numbersArray[converted]);
                break;
            case '2':
                converted = Integer.parseInt(String.valueOf(secondDigit));
                System.out.print(" twenty " + numbersArray[converted]);
                break;
            case '3':
                converted = Integer.parseInt(String.valueOf(secondDigit));
                System.out.print(" thirty " + numbersArray[converted]);
                break;
            case '4':
                converted = Integer.parseInt(String.valueOf(secondDigit));
                System.out.print(" forty " + numbersArray[converted]);
                break;
            case '5':
                converted = Integer.parseInt(String.valueOf(secondDigit));
                System.out.print(" fifty " + numbersArray[converted]);
                break;
            default:
                System.out.println("Invalid Character");

        }
        System.out.println(" hours");
    }


}
