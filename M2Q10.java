import java.util.Scanner;
/**
 * M2Q10
 */
public class M2Q10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i= 1;i<=n;i++){
            for(int x=1;x<=n;x++){
                System.out.print(i*x + "\t");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}