package com.stackroute.pe2;

public class ReversePalindrome {

    public String palindromeCheck(String data){

        if (data == null)
            return null;

        String  reverse = "";
        for ( int i = data.length() - 1; i >= 0; i-- )
            reverse = reverse + data.charAt(i);

        if (data.equals(reverse))
            return "palindrome";
        else
            return "not palindrome";
    }

}
