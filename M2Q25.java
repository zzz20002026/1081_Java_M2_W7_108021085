import java.util.Scanner;
/**
 * M2Q25
 */
public class M2Q25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0, x = 0;
        boolean bln = true;
        for(int i=2;i<=n;i++){
            x = i;
            for(;x!=1;){
                if(x % 2 == 0){
                    x = x/2;
                }
                else if(x % 3 == 0){
                    x = x/3;
                }
                else if(x %5 ==0){
                    x = x/5;
                }
                else{
                    bln = false;
                    break;
                }
            }
            if(bln) sum = sum + i;
            bln = true;
        }
        System.out.println(sum);
    }
}