import java.util.Scanner;

public class Baze {

    public  static void main(String [] a){
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int m=scanner.nextInt();
         long [] B= new long[n+1];
        for (int i = 0; i < n; i++) {
            B[i+1]=B[i]+scanner.nextInt();
        }

    Long [] ans=new Long[m];
        for (int i = 0; i < m; i++) {
            int L=scanner.nextInt();
            int R =scanner.nextInt();
            System.out.println(B[R]-B[L-1]);
        }
//        for (int i = 0; i < m; i++) {
//            System.out.println(ans[i]);
//        }



    }

}
