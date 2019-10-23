import java.util.Scanner;
public class M2Q1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float v1 = scn.nextFloat();
        float maxVal = v1;
        float minVal = v1;
        for(int i=1;i<=9;i++){
            v1 = scn.nextFloat();
            if(v1>maxVal){
                maxVal = v1;
            }
            else if(v1<minVal){
                minVal = v1;
            }
        }
        System.out.printf("max=%.2f \n",maxVal);
        System.out.printf("min=%.2f \n ",minVal);
    }
}