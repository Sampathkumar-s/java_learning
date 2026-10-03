import java.util.Scanner;

class demo{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a>b)
        {
            System.out.print("A is Greater");
        }
        else{
            System.out.print("B is greater");
        }


    }
}