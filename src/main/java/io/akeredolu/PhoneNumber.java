package io.akeredolu;

/**
 * Created by mikailaakeredolu on 6/8/16.
 */
public class PhoneNumber {

    private String[] anArray = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public void printAsWords(String number){
        for (int x = 0; x < number.length(); x++) {
            char charHolder = number.charAt(x);
            try {
                int n = Integer.parseInt(String.valueOf(charHolder));
                System.out.print(anArray[n] + " ");
            }
            catch (Exception e) {
                continue; //it will go to the next element in the loop
            }
        }
        System.out.println();
    }

    public boolean isPhoneNumber(String number) {
        return number.matches("^\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$");
    }
}
