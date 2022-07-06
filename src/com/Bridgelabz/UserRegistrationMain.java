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

    void lastName() {
        String lastName = "Bhaskaran";
        Matcher matcher = NAME_PATTERN.matcher(lastName);
        if(matcher.matches()){
            System.out.println("The LastName is Valid");
        }
        else
            System.out.println("Invalid");
    }
    static Pattern EMAIL_PATTERN = Pattern.compile("^[A-Z a-z 0-9]+([.][A-Za-z0-9]+)@([a-z]+[.][a-z]{2,3})+([.][a-z]+)$");
//abc.xyz@bl.co.in
    void email() {
        String email = "abc.xyz@bl.com.in";
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        if (matcher.matches()){
            System.out.println("The Email id is valid ");
        }
        else
            System.out.println("Invalid email id ");
    }
    public static void main(String[] args) {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        userRegistrationMain.firstName();
        userRegistrationMain.lastName();
        userRegistrationMain.email();

    }

    }

