// Console work only. exp: java num4 1 2 3 4
class num4 {
    public static void main(String[] args) {

    int sum=0, mult=1;
    int y;


        for (int i=0; args.length>i;i++ ){ //Get back args

            System.out.println("Argument : " + args[i]);

            y =Integer.parseInt(args[i]);  //revert args(string) to integer
            sum+=y;
            mult*=y;


        }
        System.out.print("Sum=" + sum+"\t");
        System.out.print("multiplication=" + mult+"\n");




    }
}
