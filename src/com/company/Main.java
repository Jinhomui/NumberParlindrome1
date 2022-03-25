package com.company;

public class Main {

    public static void main(String[] args) {
        isPalindrome(-121);
    }

    public static boolean isPalindrome(int number) {

        if (Math.abs(reverse(number)) == Math.abs(number)) {
            return true;
        }

        if (number < 0) {
            number = Math.abs(number);
        }

        System.out.println(reverse(number));

        int Digitcount;
        int count = 0;
        while (number > 0) {
            number = number / 10;
            number = number % 10;
            count++;
            Digitcount=0;
            System.out.println(number);
            System.out.println(Digitcount);
        }

        return false;
    }

    public static int reverse(int number) {
        int reverse = 0;
        int lastDigit;
        int count = 0;

        while (number > 0) {

            lastDigit = number % 10;

            reverse = reverse + lastDigit;
            System.out.println("First reverse= " + reverse);
            System.out.println(lastDigit + "*******");

            number = number / 10;
            System.out.println("Number= " + number);

            reverse = reverse * 10;
            System.out.println("Reverse= " + reverse);

            count++;
            System.out.println(count);
        }
        return reverse;
    }


}
