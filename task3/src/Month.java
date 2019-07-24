import java.util.Scanner; //import scan for reading keyboards
class Month {
    public static void main(String args[])   {

        int z;
        String[] month = {"Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь",
                "Ноябрь", "Декабрь"};            //just a copied
        Scanner input = new Scanner(System.in); //initialization reading numbers from console

        for (;;) {

            System.out.print("Enter a number of month, for exit enter 999: ");
            z = input.nextInt();                 //reading numbers from console
            if (z==999) break;                  // exit from the program


            if (z <= 0 | z > 12) {              //checking for wrong numbers of  month
                System.out.println(z + " is wrong month ");
            }
            else if (z > 0 | z < 12 ) {         //checking for right numbers of month('if' always true)
                System.out.println(z + " month is " +month[z-1]);

            }
        }
    }
}
