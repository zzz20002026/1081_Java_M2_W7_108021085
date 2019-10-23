import java.util.Scanner;
public class M2Q8{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int sum = 0;
        for(int i=3;i<=v1;i=i+3){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}