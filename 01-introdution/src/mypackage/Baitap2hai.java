package mypackage;

public class Baitap2hai {
    public static void main(String[] args) {
        int a=6,b=9,c=-10;
        double   deLta = Math.pow(b,2)-(4*a*c);
        double x1= (-b+Math.sqrt(deLta))/(2*a);
        double x2= (-b-Math.sqrt(deLta))/(2*a);
        System.out.println("x1=" + x1 );
        System.out.println("x2=" + x2 );
    }
}
