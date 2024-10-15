import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String [] args){
                Random rand = new Random();
                Scanner scanner = new Scanner(System.in);

                int die1=0;
                int die2=1;
                int die3=2;
                int sum;
                String goAgain="";
                int counter;

                do {
                    counter=0;
                    die1 = 0;
                    die2 = 0;
                    die3 = 0;


                    System.out.println("Roll   Die1    Die2    Die3    Sum");
                    System.out.println("-----------------------------------");

                    do{
                    counter++;
                    die1=rand.nextInt(1,7);
                    die2=rand.nextInt(1,7);
                    die3=rand.nextInt(1,7);
                    sum=die1+die2+die3;

                    System.out.printf("%-8d%-8d %-7d %-7d %-7d",counter,die1,die2,die3,sum);
                    System.out.printf("\n");
                }while (die1 != die2 || die2 != die3);
                System.out.println("Do you want to roll again? (y/n)");
                    goAgain=scanner.next();

                }while(goAgain.equalsIgnoreCase("Y"));
            }
        }
