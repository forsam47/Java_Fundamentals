import java.util.Scanner; //import scan for reading keyboards
class num2_1 {
    public static void main(String[] args){
        int x,z=0,d=0;
        int max = Integer.MIN_VALUE; //search for MAX n
        int min = Integer.MAX_VALUE; //search for MIN n

        Scanner input = new Scanner(System.in);   //initialization  reading from console
        System.out.print("Enter rows of the Array"+" ");
        x = input.nextInt();                     //initialization  reading x from console
        int[] number= new int[x];               //adding Array with x rows


        for (int i=0; i<number.length;i++) {   //cycle  for entering n numbers
            System.out.print("Enter the number " + i + " ");
            number[i]=input.nextInt();         //Entering of n numbers
            String k = Integer.toString(number[i]); /*converting k from integer to string, variable integer can't calculate
            length of n numbers*/

            if (number[i]<min){               //'if' for min n
                min=number[i];
                d=k.length();
            }

            if (number[i]>max){              //'if' for max n
                max=number[i];
                z=k.length();
            }

        }
        System.out.println("Minimal digit: "+min + "  Digit Length " +d);
        System.out.println("Maximal digit: "+max + "  Digit Length "+ z);
    }
}
