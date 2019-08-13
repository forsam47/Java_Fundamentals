// Sort an Array of rows from low to hi by 'k' row

import java.util.Random; //for random numbers
import java.util.Scanner; //for reading keyboards


class num2_1_sortBY_low_hi {
    public static void main(String[] args) {
        int x, y, lines;
        Scanner input = new Scanner(System.in); //reading from the console
        System.out.print("Entering quantity of lines ");
        x = input.nextInt();                   //reading 'x' from the console
        System.out.print("Entering quantity of columns ");
        y = input.nextInt();                  //reading 'y' from the console
        int[][] numbrs = new int[x][y];
        Random rand = new Random();          //doing random numbers
        System.out.print("From which line will be starting  sorted ");
        lines = input.nextInt();            //reading 'line' from the console

        System.out.println("\n" + "___NEW___MATRIX___" + "\n");
        for (int i = 0; i < x; i++) {         //Just for entering data
            for (int z = 0; z < y; z++) {
                int xx;
                xx = rand.nextInt();
                xx = Math.round(xx / 1000000);  // doing max number 'xxxx'
                numbrs[i][z] = xx;
                System.out.printf("%5d ", numbrs[i][z]); // for alignment

            }
            System.out.println();
        }
        /*Bubble sort by rows. If you are sort by columns - change y  to x
        and / to % e.g. i>=x(lines-1);
        (numbrs[(int)i%y][(int)i/y]) > (numbrs[(int)z%y][(int)z/y])
         */
        for (int i = 0; i < y * x - 1; i++) {
            for (int z = i; z < y * x; z++) {
                if (i >= y * (lines - 1)) {   //From which line will be starting  sorted
                    if ((numbrs[i / y][i % y]) > (numbrs[z / y][z % y])) { /* Compare numbrs[0][0] with
                whole Array, after that numbrs[0][1] with whole Array, etc.  */


                        int tempArray;     // temp data
                        tempArray = (numbrs[i / y][i % y]);
                        (numbrs[i / y][i % y]) = (numbrs[z / y][z % y]);
                        (numbrs[z / y][z % y]) = tempArray; // If numbrs[0][0]>nubrs[0][1], then swap
                    }
                }
            }
        }
        System.out.println("\n" + "__Sorted__MATRIX__" + "\n");
        for (int i = 0; i < x; i++) {             //Just for printing
            for (int z = 0; z < y; z++) {

                System.out.printf("%5d ", numbrs[i][z]); // for alignment
            }

            System.out.println();
        }

    }

}
