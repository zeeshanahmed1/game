// Prepared by Zeeshan Ahmed


package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int ask =0;
        int count = 3;

        System.out.println("\tWELCOME!!");
        System.out.println("Do You Want To Play This Game ? (1/2)");

        Scanner input = new Scanner(System.in);

        ask = input.nextInt();

        while(count !=0) {

            int credit = count - 1;

            if (ask == 1)
            {
                System.out.println("\n\n");
                System.out.println("Enter Any Number (1-10)                            Credits "+ credit);
                int ginput = input.nextInt();
                Random rnd = new Random();
                int rinput = (rnd.nextInt(10)+1);

                if ((ginput >= 1) && (ginput <= 10))
                {
                    if (ginput == rinput)
                    {
                        System.out.println("\tCongratulations!!");
                        System.out.println("The Number Is : "+rinput);

                    }
                    else
                    {
                        System.out.println("\tYou Loose the game");
                        System.out.println("The Number Is : "+rinput);

                    }

                } else {

                    System.out.println("INVALID INPUT !!");

                }


            }

            else if (ask == 2)

            {

                break;


            }

            else
            {
                System.out.println("INVALID INPUT !!!");

            }

            if(count > 1) {
                System.out.println();
                System.out.println("Do you wanna try again? (1/2) ");
                int tinput = input.nextInt();

                if (tinput == 1) {
                    count--;
                } else {

                    break;

                }
            }
            else

            {
                System.out.println();
                System.out.println("Now you have to Add Credits 1-10");
                int cinput = input.nextInt();
                if ((cinput >= 1) && (cinput <= 10)) {

                    count = cinput;

                }

                else
                {
                    System.out.println("You Cannot Add More then 10 Credits");

                }


            }




        }

    }
}
