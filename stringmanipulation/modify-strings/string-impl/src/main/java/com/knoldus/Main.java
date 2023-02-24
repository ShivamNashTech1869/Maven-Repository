package com.knoldus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringApi StringApi_object = new StringApi();
        Scanner scacnner_object = new Scanner(System.in);
        String string = new String();
        String reverse_string = new String();
        int string_length = 0;
        System.out.print("Enter your String : ");
        string = scacnner_object.next();
        string_length = StringApi_object.getStringLength(string);
        reverse_string = StringApi_object.reverseString(string);
        System.out.println("your string : "+string);
        System.out.println("Length of string : "+string_length);
        System.out.println("Reverse of string : "+reverse_string);

    }
}