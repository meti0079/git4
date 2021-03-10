import java.util.Scanner;

public class TakeTime {
    public static  void main(String [] args){
        Scanner sca=new Scanner(System.in);
        int [] b= new int[3];
        int [] a= new int[3];
        for (int i =2; i > -1; i--) {
            b[i]=sca.nextInt();
        }
        for (int i =2; i > -1; i--) {
            a[i]=sca.nextInt();
        }
        for (int i = 0 ; i < 2; i++) {
            int x=a[i]+b[i];
            if(x>=60){
                a[i]=x%60;
                a[i+1]++;
            }else{
                a[i]=x;
            }
        }
        a[2]=a[2]+b[2];
        if(a[2]<24)
            System.out.println(a[2]+" "+a[1]+" "+a[0]);
        else
            System.out.println("too long");

    }
}
