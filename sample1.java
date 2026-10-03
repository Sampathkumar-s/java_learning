import java.util.Scanner;
class sample1{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your age: ");
        int a = scan.nextInt();
        System.out.print("Hello "+name+"your age is "+a);

    }
}