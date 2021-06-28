/**
 * @author salika
 */
import java.util.Arrays;
import java.util.Scanner;
public class homeworks4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println();
        System.out.println("---------------------------Homework1--------------------------------");
        System.out.println();
        System.out.println("---------------------------Find min max value--------------------------------");
        System.out.println();

        System.out.println("How many number will you enter? : ");
        int i = scan.nextInt();
        int[] array=new int[i];
        int k=0;
        while(k<i){
            System.out.println("Enter number "+(k+1)+" : ");
            int j = scan.nextInt();
            array[k]=j;
            k++;
        }

        Arrays.sort(array);
        System.out.println("Biggest number : "+array[k-1]);
        System.out.println("Smallest number : "+array[0]);


         

        /*
        System.out.println();
        System.out.println("---------------------------Homework2--------------------------------");
        System.out.println();
        System.out.println("---------------------------Find perfect number--------------------------------");
        System.out.println();

        System.out.println("Enter number: ");
        int number2= scan.nextInt();
        int total2=0;
        for (int i=1;i<number2;i++){
            if(number2%i == 0)
                total2=total2+i;
        }
        if (number2==total2)
            System.out.println(number2+" is a perfect number");
        else
            System.out.println(number2+" is not a perfect number");



         */



        /*

        System.out.println();
        System.out.println("---------------------------Homework3--------------------------------");
        System.out.println();
        System.out.println("---------------------------Inverted triangle stars--------------------------------");
        System.out.println();

        System.out.println("Enter number :");
        int n = scan.nextInt();

        for (int i = n-1; i >= 0 ; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


         */
        /*

        System.out.println();
        System.out.println("---------------------------Homework4--------------------------------");
        System.out.println();
        System.out.println("---------------------------Program to Find Prime Numbers Between 1-100--------------------------------");
        System.out.println();

        int count = 0;
        for(int sayi=2;sayi<=100;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                }
            }

            if(kontrol==0)
            {
                System.out.print(sayi+"\n");
                count++;
            }
        }

        */
        /*
        System.out.println();
        System.out.println("---------------------------Homework5--------------------------------");
        System.out.println();
        System.out.println("---------------------------Fibonacci Series--------------------------------");
        System.out.println();

        System.out.println("Enter how many fibonacci numbers to write : ");
        int count= scan.nextInt();
        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

         */
}}
