package com.company;

public class Main {

    public static void main(String[] args) {
        isPalindrome(1234567899);
    }

    public static boolean isPalindrome(int number) {

        if (reverse(Math.abs(number)) == Math.abs(number)) {
             System.out.println(reverse(Math.abs(number)));
            System.out.println("This is a Palindrome");
             return true;
        }

        System.out.println(reverse(number));

        return false;
    }

    public static int reverse(int number) {
        int reverse = 0;
        int lastDigit;

        while (number > 0) {

            reverse = reverse * 10;

            lastDigit = number % 10;

            reverse = reverse + lastDigit;
//            System.out.println("First reverse= " + reverse);
//            System.out.println(lastDigit + "*******");

            number = number / 10;
//            System.out.println("Number= " + number);

//            System.out.println("Reverse= " + reverse);

        }
        return reverse;
    }


}
