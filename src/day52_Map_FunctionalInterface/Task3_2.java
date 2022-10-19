package day52_Map_FunctionalInterface;

import java.util.function.Predicate;

public class Task3_2 {
    public static void main(String[] args) {

        Predicate<String> password = (p) -> {

            boolean eightDigitNoSpace = false;
            boolean upper = false;
            boolean lower = false;
            boolean special = false;
            boolean digit = false;
        char pChar [] = p.toCharArray();

           if( p.length() >= 8 && !p.contains(" ")) {
               eightDigitNoSpace = true;
               for (char each : pChar  ) {
                   if (Character.isDigit(each)){
                       digit = true ;
                   } else if (Character.isUpperCase(each) ) {
                       upper = true;
                   } else if (Character.isLowerCase(each) ) {
                       lower = true;
                   } else {
                       special = true;
                   }
               }
           }
            boolean result = eightDigitNoSpace && upper && lower && special && digit;
           return  result;
        };

        String passWord = "Edirne22@";
        System.out.println("password.test(passWord) = " + password.test(passWord));
    }

    //3.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
    //		        1 Password must be at least have 8 characters long, and should not contain space
    //		        2 PassWord should at least contain one upper case letter
    //		        3 PassWord should at least contain one lower case letter
    //		        4 Password should at least contain one special characters
    //		        5 Password should at least contain a digit




}
