package fizzBuzz;

import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        }else if(number % 3 == 0){
            System.out.println("Buzz");
        }else if(number % 5 == 0){
            System.out.println("Fizz");
        }else{
            System.out.println(number);
        }
    }
}
