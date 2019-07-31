//Sorting the numbers by average length, hi or low

import java.util.Scanner; //for reading keyboards

class num2_3_mid_len {
    public static void main(String[] args) {
        int x, sum = 0, mid = 0;
        String g = "";
        Scanner input = new Scanner(System.in); //reading from the console
        System.out.print("Enter rows of the Array" + " ");
        x = input.nextInt();                      //reading 'x' from the console
        String[] numbers = new String[x];

        for (int i = 0; i < numbers.length; i++) {   //Cycle for entering and for calculating middle length

            System.out.print("Enter the number " + i + " ");
            numbers[i] = input.next();
            sum += numbers[i].length();
            mid = Math.round(sum / x);
        }

        for (int t = 0; t < numbers.length; t++) {  //Cycle for sorting

            if (numbers[t].length() > mid) {
                g = numbers[t];
                System.out.println(" More: " + numbers[t] + " Len1 " + g.length());
            }
            if (numbers[t].length() < mid) {
                g = numbers[t];
                System.out.println(" Less: " + numbers[t] + " Len2 " + g.length());
            }
        }
    }
}
