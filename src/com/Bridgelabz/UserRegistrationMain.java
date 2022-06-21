package com.Bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationMain {
    static Pattern NAME_PATTERN = Pattern.compile("^[A-Z]{1}[a-z]{1,}$");
    void firstName() {
        String firsName = "Poojasri";
        Matcher matcher = NAME_PATTERN.matcher(firsName);
        if(matcher.matches()){
            System.out.println("The FirstName is Valid");
        }
        else
            System.out.println("Invalid");
    }

    public static void main(String[] args) {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        userRegistrationMain.firstName();
    }
}
