package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;


public class App {

    // Implement all methods as public static

        // methods contain modifier, [Output 0...1 -->] return type (alle primitiven und nicht primitiven Datentypen),
        // name + (parameter) [<-- Input 0...*]
        //for (int i = 0; 1 < args.length; i++) {System.out.println(args[i]);}

        // test your method implementations here
        // make method calls
        // print their results
        // etc.

        //Parametername frei wählbar :-)

        // int []numbers1 = new int[10];
        // numbers1 [0] = 44; //setze Stelle 0 (linkeste Stelle) vom Array auf den Wert 44
        // int x = numbers1[9];
        // boolean returnValue = swapArrays(new int []{4,3,2}, new int[]{4});
        //public static void oneMonthCalendar (int startingDay, int numberDays)


        public static void oneMonthCalendar (int numberDays, int startingDay){

            int weekDay = startingDay;

            for (int i = 1; i < startingDay * 3 - 2; i++) {
                System.out.print(" ");
            }
            for (int countDay = 1; countDay <= numberDays; countDay++) {

                if (startingDay + countDay == 9){
                    System.out.println();
                }

                if (countDay < 10) {
                    System.out.print(" ");
                }

                System.out.print(countDay + " ");
                //countDay++;

                if (weekDay % 7 == 0 && countDay > 7) {
                    System.out.println();
                }

                weekDay++;

                if (countDay == numberDays && countDay < 30){
                    System.out.println();
                }
            }

            //% 7 für Zeilenumbruch
            //2x count für Tag-Zahl und Wochentag
            //oneMonthCalendar(numberDays: 31, startingDay: 3);

        }

        public static long[] lcg(long input) {
            long [] array = new long[10];
            //Random randomNumber = new Random();
            //long x = randomNumber.nextLong();
            long a = 1103515245;
            int c = 12345;
            long m = (long) Math.pow(2, 31);

            array[0] = (a * input + c) % m;

            for (int h = 1; h < 10; h++) {
                array[h] = (a * array[h-1] + c) % m;
            }
            return array;
        }


        public static int randomNumberBetweenOneAndHundred(){
            return (int) (Math.random() * 99 + 1);
        }

        public static void guessingGame(int numberToGuess) {
            //Random randomNumber = new Random(); //https://www.educative.io/answers/how-to-generate-random-numbers-in-java
            Scanner scan = new Scanner(System.in);
           // guessingGame(randomNumberBetweenOneAndHundred());
            int countNumber = 1;
            //int numberToGuess = randomNumber.nextInt(101);
            //numberToGuess = randomNumberBetweenOneAndHundred();
            int guessNumber;

            do {
                System.out.print("Guess number " + countNumber + ": ");
                guessNumber = scan.nextInt();
                countNumber++;
                if (countNumber < 11) {
                    if (guessNumber > numberToGuess) {

                        System.out.println("The number AI picked is lower than your guess.");

                    } else if (guessNumber < numberToGuess) {
                        //kleiner als random
                        System.out.println("The number AI picked is higher than your guess.");

                    }
                }

            } while (countNumber < 11 && guessNumber != numberToGuess);

            if (guessNumber != numberToGuess) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
            } else {
                System.out.print("You won wisenheimer!");
                System.out.println();

            }
        }


    public static boolean swapArrays (int[] numbers1, int[] numbers2){
        if(numbers1.length != numbers2.length) {
        return false; //davor Vergleich der beiden Arrays auf ungleiche Länge
        }
        return true;
        }
        // boolean returnValue = swapArrays(new int []{4,3,2}, new int[]{4});

            public static void main (String[]args){
                //App exercise3 = new App();

                //System.out.println("Pseudo Random Numbers:");
                //lgc();

                //System.out.println("Guessing Game:");
                //randomNumberBetweenOneAndHundred();
                //guessingGame()int, class);
            }
        }


//camelcase wenn buchstabe erreicht und davor leerzeichen, dann groß --> Bsp 5 als letztes machen
// (int) ('a' - 'A') // = 32 --> Abstand zwischen klein- und Großbuchstaben

