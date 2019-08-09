/* 1)to find numbers from low to hi e.g. 1,2,3,4 */

import java.util.Scanner;  //for reading keyboards

public class num2_6_Tofind_numb_1234 {
    public static void main(String[] args) {
        int Amount = 0, I = 0, z, x, Am;
        Scanner input = new Scanner(System.in); //reading from the console
        System.out.print("Enter the number of rows in the Array" + " ");
        x = input.nextInt();  //reading 'x' from the console
        String[] numbers = new String[x];

        for (int i = 0; i < numbers.length; i++) {  //Just for entering data
            System.out.print("Enter the number " + (i + 1) + " ");
            numbers[i] = input.next(); //reading numbers
        }

        for (z = 0; z < numbers.length; z++) {  //Main cycle

            char[] Ch = numbers[z].toCharArray();

            for (int y = 0; y < Ch.length; y++) {  //Numbers search cycle

                int Amfn, Amln;
                Am = Character.getNumericValue(Ch[y]);  //Converting char to int, for  math compare digits

                if (Ch[y] == '-') I++;                 //For negative Numbers
                if (Ch[y] == '0') continue;            //Remove '0'. Zero don't need

                if (I == 0) {                         //"IF" for positive numbers
                    if (Ch.length - 1 > y) {        //e.g. (1,2,3,4) Will be compare only 1,2,3
                        Amfn = Character.getNumericValue(Ch[y + 1] - 1); //(2-1=1)
                        if (Amfn == Am) Amount++;
                    }

                    if (Ch.length == y + 1) {     //e.g. (1,2,3,4) Will be compare only 4
                        Amln = Character.getNumericValue(Ch[y - 1] + 1); //(3+1=4)
                        if (Amln == Am) Amount++;
                    }
                }
                if (I == 1) {   //"IF" for negative numbers. I think -54321  is correct, -12345  is wrong
                    if (Ch.length - 1 > y) { //e.g. (-5,4,3,2,1) Will be compare only 5,4,3,2
                        Amfn = Character.getNumericValue(Ch[y + 1] + 1); //  (4+1=5) This digits really are positive
                        if (Amfn == Am) Amount++;
                    }

                    if (Ch.length == y + 1) { //e.g. (-5,4,3,2,1) Will be compare only 1
                        Amln = Character.getNumericValue(Ch[y - 1] - 1); // (2-1=1) This digits really are positive
                        if (Amln == Am) Amount++;
                    }
                }


            }
            if (Amount == Ch.length) { // If numbers is from low to hi (e.g. 1,2,3,4), Print this number

                System.out.println("positive: " + numbers[z]);
                z = numbers.length;
            }
            if (Amount + I == Ch.length & I == 1) { // If numbers is from low to hi (e.g. -5,4,3,2,1), Print this number

                System.out.println("negative: " + numbers[z]);
                z = numbers.length;
            }
            Amount = 0;
            I = 0;


        }
    }
}