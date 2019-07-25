import java.util.Scanner; //import scan for reading keyboards
class num3 {
    public static void main(String[] args){
        int x;

        System.out.print("Enter the number of rows in the Array:");
        Scanner input = new Scanner(System.in); //initialization reading from console
        x = input.nextInt();                    //reading x from console
        int[] number= new int[x];               //add Array with x rows

                for (int y=0; y<number.length; y++) { //1 cycle for println
                 number[y]= (int) (Math.random()*100);// add random number
                 System.out.println( number[y]+"\n");
                 }

        for (int i : number) {                   //2 cycle for print
            System.out.print(i + "\t");
        }




    }
}
