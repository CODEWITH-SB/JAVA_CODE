import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        System.out.print("Sum of 1 to ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        System.out.println();
        long ans = (n*(n+1))/2;
        System.out.println("Sum = "+ans);
    }
}
