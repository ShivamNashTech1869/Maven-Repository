package com.knoldus;

public class StringApi {
   //function 1 for reverse the string
    public String reverseString(String given_string)
    {
        if(given_string == null)
          return null;
       String result_string = new String();
       int string_length = getStringLength(given_string);
       int index=0;
       for(index=string_length-1;index>=0;index--)
       {
           result_string += given_string.charAt(index);
       }
       return result_string;
    }
    //function 2 for get the length of string
    public int getStringLength(String given_string)
    {
       int string_length=0;
       for(char string_character : given_string.toCharArray())
       {
           string_length ++;
       }
       return string_length;

    }
}