import java.util.Scanner; //import scan for reading keyboards
class UserName {
    public static void  main(String args[]) {
        Scanner name = new Scanner(System.in); //initialization reading name from console
        System.out.print("Hello USER, What is your name:");
        String username = name.nextLine();     //reading name from console
        System.out.println("Hello" + " " + username);

    }

}
