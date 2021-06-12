package assignments;
import java.util.Scanner;

public class A6Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cost price");
        int cprice = input.nextInt();
        System.out.println("Enter the sale price");
        int sprice = input.nextInt();

        cprofit(cprice,sprice);
    }
    static int cprofit(int cprice,int sprice){
        if (sprice > cprice)
        {
            System.out.println("PROFIT");
        }
        else if (sprice < cprice)
        {
            System.out.println("LOSS");
        }
        else
        {
            System.out.println("NO LOSS");
        }
    return 0;}
}
