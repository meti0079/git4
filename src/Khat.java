import java.util.Scanner;

public class Khat {
    public  static  void main(String [] a){
        Scanner scanner =new Scanner(System.in);

        int [] xi = new int[4];
        int [] yi = new int[4];
        int i =0;
        while (i<4){
            xi[i]=scanner.nextInt();
            yi[i]=scanner.nextInt();
            i++;
        }

        double Mab=(1.0*yi[0] - yi[1])/(xi[0]-xi[1]);
        double Mcd=(1.0*yi[2] - yi[3])/(xi[2]-xi[3]);

        if( Mab !=Mcd ) {


            double bAB = yi[0] - Mab * xi[0];
            double bCD = yi[2] - Mcd * xi[2];

//  y= Mab*x+bAB
//  y= Mcd*x+bCD
// Mab*x+bAB= Mcd*x+ bCD
            double x = (bCD - bAB) / (Mab - Mcd);

            if (xi[0] > xi[1]) {
                xi[0] = xi[0] + xi[1];
                xi[1] = xi[0] - xi[1];
                xi[0] = xi[0] - xi[1];
            }
            if (xi[2] > xi[3]) {
                xi[2] = xi[2] + xi[3];
                xi[3] = xi[2] - xi[3];
                xi[2] = xi[2] - xi[3];
            }


            if (x >= xi[0] && x <= xi[1] && x >= xi[2] && x <= xi[3]) {
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
        }else {
            System.out.print("NO");
        }





    }
}
