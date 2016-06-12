package io.akeredolu;

import java.util.StringTokenizer;

/**
 * Created by mikailaakeredolu on 6/8/16.
 */


public class CivilianTime {

    private String[] numbersArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve"};

    public boolean isCivilianTime(String number) {
        return number.matches("[0-1]?\\d:[0-5]\\d[apAP][mM]");
    }

    public void printAsWords(String time) {
        // System.out.println("Civilian time is : " + time);
        StringTokenizer stringTokenizer = new StringTokenizer(time, ":");
        String Hours = stringTokenizer.nextToken();
        String Minutes = stringTokenizer.nextToken();
        printCivilianHours(Hours);
        printCivilianMinutes(Minutes);
        printAMPM(time);
    }

    private void printAMPM(String time) {
        int lastIndex = time.length() - 1; //last index is 7
        String ampm = time.substring(lastIndex - 1); //am pm starts at 6
        System.out.println(" " + ampm);
    }


    public void printCivilianHours(String Hrs) {
        int converted = Integer.parseInt(Hrs);
        System.out.print(numbersArray[converted]);
    }

    public void printCivilianMinutes(String Mins) {
        char firstDigit = Mins.charAt(0);
        char secondDigit = Mins.charAt(1);
        int converted = -1;
        switch (firstDigit) {
            case '0':
                if (secondDigit == '0') {
                    System.out.print(" O'clock");
                } else {
                    System.out.print(" o " + numbersArray[Integer.parseInt(String.valueOf(secondDigit))]);
                }
                break;
            case '1':
                converted = Integer.parseInt(Mins);
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

    }

}
