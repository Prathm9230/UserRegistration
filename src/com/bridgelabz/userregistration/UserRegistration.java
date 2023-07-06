package com.bridgelabz.userregistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {
    public void validfirstname()
    {
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String Firstname=sc.nextLine();

        Matcher matcher=pattern.matcher(Firstname);
        if(matcher.matches())
        {
            System.out.println("Nice!Your First name is valid.");
        }
        else {
            System.out.println("Sorry! your First name is not valid.");
        }
    }

    public static void main(String[] args)
    {
        UserRegistration ur = new UserRegistration();
        ur.validfirstname();
    }

}
