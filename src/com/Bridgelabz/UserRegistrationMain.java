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

    static Pattern PHONENUMBER_PATTERN = Pattern.compile("^([1-9]{1,2}[ ])+([6-9]{1}[0-9]{9})$");

    void phoneNumber(){
        String phoneNumber = "91 9919819801";
        Matcher matcher = PHONENUMBER_PATTERN.matcher(phoneNumber);
        if (matcher.matches()){
            System.out.println("Phone number is valid ");
        }
        else
            System.out.println("Phone number is not valid");
    }

    static Pattern PASSWORD1_PATTERN = Pattern.compile("^[a-z]{8}$");
    void passwordRule1(){
        String password_1 = "abcdefgh";
        Matcher matcher = PASSWORD1_PATTERN.matcher(password_1);
        if (matcher.matches()){
            System.out.println("Password is correctly matches to the rule");
        }
        else
            System.out.println("Password doesn't match the requirement");
    }

    static Pattern PASSWORD2_PATTERN = Pattern.compile( "^[a-zA-Z]{8}$");
    void passwordRule2(){
        String password_2 = "abcdEfgh";
        System.out.println("Password should have atleast one UPPERCASE");
        Matcher matcher = PASSWORD2_PATTERN.matcher(password_2);
        if (matcher.matches()){
            System.out.println("Password is correctly matches to the rule2");
        }
        else
            System.out.println("Password doesn't match the requirement");
    }

    static Pattern PASSWORD3_PATTERN = Pattern.compile( "^[a-zA-Z0-9]{8,}$");
    void passwordRule3(){
        String password_3 = "abcdEfg1";
        System.out.println("Password should have atleast one number");
        Matcher matcher = PASSWORD3_PATTERN.matcher(password_3);
        if (matcher.matches()){
            System.out.println("Password is correctly matches to the rule3");
        }
        else
            System.out.println("Password doesn't match the requirement");
    }
    public static void main(String[] args) {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
//        userRegistrationMain.firstName();
//        userRegistrationMain.lastName();
//        userRegistrationMain.email();
//        userRegistrationMain.phoneNumber();
//        userRegistrationMain.passwordRule1();
//        userRegistrationMain.passwordRule2();
        userRegistrationMain.passwordRule3();
    }
}

