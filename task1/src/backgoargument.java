// Console work only. exp: java num4 1 2 3 4
class backgoargument {
    public static void main(String[] args) {


        for (int i=args.length -1; i>=0; i--){ //Revers Array

            System.out.println("Argument : " + args[i]);
        }
    }
}
