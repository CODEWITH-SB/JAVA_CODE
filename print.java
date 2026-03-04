import java.util.Scanner;
public class print {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            System.out.println(i);
        }
    }
}
