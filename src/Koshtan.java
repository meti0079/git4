import java.util.Scanner;

public class Koshtan {
    public  static  void main(String [] a ){

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        boolean [] A=new boolean[n];
        int siza=n;

        int m=scanner.nextInt();
        int j=0;

        while (siza>1){
            int help=0;
            while (help!=m){
                if(!A[j]){
                    help++;
                }
                j++;
                j=j%n;
            }
            if(j==0){
                A[n-1]=true;

            }else
            A[(j-1)%n]=true;
            siza--;
        }

        for (int i = 0; i < n; i++) {
            if(!A[i]){
                System.out.println(i+1);
            }
        }






    }

}
