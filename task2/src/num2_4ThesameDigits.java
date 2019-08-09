//Sorting by the same digits, exmp 123-wrong '11'2-right

import java.util.Scanner; //for reading keyboards

class num2_4ThesameDigits {
    public static void main(String[] args) {
        int x, y, sum;
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

                    if (b[lengthArrayB] == ch) {                    //the same digits
                        sum++;

                    }

                    if (sum == 0) continue;      //Remove digits  '0'. Maybe speeding up code

                }
                if (sum > 1) {                  //Which digits are more then 1 the same
                    System.out.println(num[y]);
                    y = num.length;          //Printing first number with the same digits
                }
            }
        }
    }
}
