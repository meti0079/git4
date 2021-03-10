public class Test {
    public static void main(String[] ar){
//        int x=2;
//        int y=10;
//
//
//
//        /////////////// swap with extra value
//        int c=x;
//        x=y;
//        y=c;
//        System.out.println( x +"    " +y);
//
/////////////// swap without extra value 1
//
//        x=x+y;
//        y=x-y;
//        x=x-y;
//        System.out.println(x +"   " +y);
////       x=x*y;
//        y=x/y;
//        x=x/y;
//
/////////////// swap without extra value 2
//
//         x=2*x+y;
//        y=x+y; // 2x+2y
//        x=y-x;
//        y=(y-2*x)/2;
//        System.out.println(x +"   " +y);
//
//        ///////////// swap without extra value 3
//        x=x*y;
//        y=x/y;
//        x=x/y;
//        System.out.println(x +"   " +y);
//
//
//        ///////////// swap without extra value 4
//
//        System.out.println("----------------------------------");
//        System.out.println("binary x: "+binary(x));
//        System.out.println("binary y: "+binary(y));
//
//        x^=y;
//        System.out.print(x+"  x   :");
//        System.out.println(binary(x));
//
//        System.out.println("----------------------------------");
//        System.out.println("binary x: "+binary(x));
//        System.out.println("binary y: "+binary(y));
//        y^=x;
//        System.out.print(y+" y   :");
//        System.out.println(binary(y));
//
//        System.out.println("----------------------------------");
//        System.out.println(binary(x));
//        System.out.println(binary(y));
//        x^=y;
//        System.out.print(x+ " x   :");
//        System.out.println(binary(x));
//        System.out.println(x +"   " +y);
//

        char b= 'C';
        b-='A'-'a';
        System.out.println('A'-'a');

        System.out.println('a'+0);
        System.out.println('A'+0);
        String x="scmxmvmzmvzvz";
      x=  x.toUpperCase();
        System.out.println(x);
    }
//
//
//


    
    public static String binary(int a){
        String x="";
        while (a!=0){
            x=(a%2)+x;
            a =a/2;
        }
        return  x;
    }
}
