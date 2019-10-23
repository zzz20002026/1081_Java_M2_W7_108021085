import java.util.Scanner;
public class M2Q6{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = n/2;
        boolean bln = true;
        for(int i=2;i<m;i++){
            if(n%i==0){
            bln = false;
            break;
            }   
        }
        if(bln){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}