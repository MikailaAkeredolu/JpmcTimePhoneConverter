package io.akeredolu;
/**
 * Created by mikailaakeredolu on 6/7/16.
 */
public class Main {

    public static void main(String[] args) {


        UserInput userInput = new UserInput();
        String result = userInput.userPrompt();

        MilitaryTime militaryTime = new MilitaryTime();
        PhoneNumber phoneNumber = new PhoneNumber();
        CivilianTime civilianTime = new CivilianTime();

        if(militaryTime.isMilitaryTime(result)){
            militaryTime.printAsWords(result);
        }else if(phoneNumber.isPhoneNumber(result)){
            phoneNumber.printAsWords(result);
        }else if(civilianTime.isCivilianTime(result)){
            civilianTime.printAsWords(result);
        }else{
            System.out.println("Invalid Input. Please try again");
        }

    }
}


