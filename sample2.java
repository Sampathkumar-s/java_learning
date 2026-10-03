import java.util.Scanner;
class sample2{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your age: ");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your address: ");
        String address = scan.nextLine();
        System.out.println(name);
        System.out.println(a);
        System.out.println(address);


    }
}