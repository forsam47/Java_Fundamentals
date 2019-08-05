/* 1)to find only Even numbers, 2)find numbers with the same
number of digits ODD & EVEN*/

import java.util.Scanner; //for reading keyboards

class num2_5_Tofind_Even_Nums {
    public static void main(String[] args) {

        int x, Am = 0, AmountE = 0, AmountO = 0, I = 0;
        Scanner input = new Scanner(System.in); //reading from the console
        System.out.print("Enter the number of rows in the Array" + " ");
        x = input.nextInt();                   //reading 'x' from the console
        String[] numbers = new String[x];

        for (int i = 0; i < numbers.length; i++) {  //Just for entering data
            System.out.print("Enter the number " + (i + 1) + " ");
            numbers[i] = input.next();
        }
        // PART 1

        for (int y = 0; y < numbers.length; y++) {        //Main cycle

            char[] Ch = numbers[y].toCharArray();  /*Converting String array to char for split the number
            exp. 123 converting to 1 2 3 */


            for (int z = 0; z < Ch.length; z++) {      //This Cycle find Even & Odd numbers


                Am = Character.getNumericValue(Ch[z]);

                if (Ch[z] == '-') I++;            //For numbers below 0

                if ((Am % 2) == 0) AmountE++;

                else if ((Am % 2) != 0 & Ch[z] != '-') AmountO++;

            }

            if (AmountE == Ch.length & AmountO == 0) System.out.println("Even number: " + numbers[y]);

            if (I == 1) {                      //For numbers below 0
                if (AmountE == (Ch.length) - 1 & AmountO == 0) System.out.println("Even number: " + numbers[y]);
            }

            //PART 2

            if (AmountE == AmountO & AmountE + AmountO == Ch.length) System.out.println("The same quantity ODD & " +
                    "Even Number: " + numbers[y]);

            if (I == 1) {                  //For numbers below 0
                if (AmountE == AmountO & AmountE + AmountO == (Ch.length) - 1)
                    System.out.println("The same quantity ODD & " +
                            "Even Number: " + numbers[y]);
            }

            AmountE = 0;
            AmountO = 0;
            I = 0; //Resets the counter
        }

    }


}
