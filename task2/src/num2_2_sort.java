// Sorting the numbers by length
import java.util.Scanner; //for reading keyboards
class num2_2_sort {
    public static void main(String[] args) {
        int x,l=0;
        String l1="";                         //Doing 'O' line length
        Scanner input=new Scanner(System.in); //reading from the console
        x=input.nextInt();                    //reading 'x' from the console
        String[] numbers=new String[x];
        String[] alt_numbers=new String[x];   //Array for temp data


        for (int i=0; i<numbers.length; i++){ //Just for entering data
            numbers[i]=input.next();

        }
        for (int r=0; r<numbers.length; r++) { //1 cycle deleted found numbers
            for (int k = 0; k < numbers.length; k++) {//2 cycle sort the numbers
                if (l1.length() < numbers[k].length()) {
                    l1 = numbers[k];
                    l = k;
                }
            }

            alt_numbers[l] = l1;               //writes temp data
            numbers[l] = "";                  //Doing 'O' digit, need for the next iteration
            l1 = "";                         //need for the next iteration
            System.out.println(alt_numbers[l]);
        }
    }
}

