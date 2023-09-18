package com.naveen;

public class Main {

    public static String longestPalindrome(String s) {

        int longestsize = 0;

        String example = s;

        String result = "";

        for (int z = 0; z < example.length(); z++) {
            s = example.substring(z, example.length());
            for (int i = 0; i < s.length(); i++) {
                StringBuilder check = new StringBuilder();
                for (int j = 0; j <= i; j++) {
                    check.append(s.charAt(j));

                }

                String actual=check.toString();
                String reverse=check.reverse().toString();

                    if(reverse.equalsIgnoreCase(actual) && reverse.length() > longestsize)
                    {
                        longestsize=check.length();
                        result = check.toString();
                        System.out.println("Longest " + check);
                    }

            }
        }


        System.out.println(longestsize);

        return result;
    }


    public static void main(String[] args) {

        System.out.println(longestPalindrome("babad"));
    }
}