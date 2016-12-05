
import java.util.Scanner;
public class Fibo {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("enter number of terms");
        int n1 = s1.nextInt();
        int a[] = new int[n1];
         a[0]=-1;
        int t1 = -1;
        a[1] = 1;
        int t2 = 1;
        int n2 = 2;
        for (int i = 1; i <= n1 - 2; i++) {
            a[n2] = t1 + t2;
            t1 = t2;
            t2 = a[n2];
            n2++;
        }
        for(int i=0;i<n1;i++)
            System.out.println(a[i]);
    }
}
