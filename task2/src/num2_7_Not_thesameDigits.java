/*Sorting by not the same digits, exmp 122-wrong,  123-right. All of code copy from num2_4ThesameDi and a little bit
changed  */

import java.util.Scanner; //for reading keyboards

public class num2_7_Not_thesameDigits {
    public static void main(String[] args) {
        int x, y, sum, C = 0, I = 0;
        Scanner input = new Scanner(System.in); //reading from the console
        System.out.print("Enter rows of the Array" + " ");
        x = input.nextInt();                      //reading 'x' from the console
        String[] num = new String[x];


        for (int i = 0; i < num.length; i++) {          //Just for entering data
            System.out.print("Enter the number " + (i + 1) + " ");
            // System.out.print("Enter the number " + i + " ");
            num[i] = input.next();
        }

        for (y = 0; y < num.length; y++) {                //Main cycle

            if (num[y].length() == 1) continue;    //Remove digits with length '1'. Maybe speeding up code
            char[] b = num[y].toCharArray();       //Converting a string Array  to chars Array,
            // for pushing digits by line
            for (int CheckFrom1to10 = 0; CheckFrom1to10 < 10; CheckFrom1to10++) { //Compare digits array
                // with 1..10
                sum = 0;

                for (int lengthArrayB = 0; lengthArrayB < b.length; lengthArrayB++) { //search the same digits
                    char ch = (char) (CheckFrom1to10 + '0');               //Converting CheckFrom1to10 to char

                    if (b[lengthArrayB] == ch)                    //the same digits
                        sum++;

                }
                if (sum > 1) {                  //Which digits are more then 1  the same
                    C++;                      //counter of identical digits


                }

            }
            for (int a = 0; a < b.length; a++) { //Cycle for negative numbers
                if (b[a] == '-')
                    I++;
            }
            if (C < 1 & I == 0) {  //"IF" for positive numbers.
                System.out.println(num[y]);
                y = num.length;       //Printing first number with not the same digits and quit
            }
            if (I != 0 & b.length > 2 & C < 1) { //"IF" for negative numbers. Also get off digits with length of 2 e.g.(-1)
                System.out.println(num[y]);
                y = num.length;       //Printing first number with not the same digits and quit
            }
            C = 0;
            I = 0;
        }
    }
}
