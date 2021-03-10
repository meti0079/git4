import java.util.Scanner;

public class Sort {
    public  static  void main(String [] arg){


        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []  a=new int[n];
        int [] b= new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
            b[i]=i+1;
        }


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(a[j]>a[j+1]){
                    /////swap value
                   a[j]=a[j]+a[j+1];
                   a[j+1]=a[j]-a[j+1];
                   a[j]=a[j]-a[j+1];

                   //////// swap andis
                    b[j]=b[j]+b[j+1];
                    b[j+1]=b[j]-b[j+1];
                    b[j]=b[j]-b[j+1];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }




    }
}
