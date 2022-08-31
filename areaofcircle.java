import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        double r,a,pie=3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius :");
        r = sc.nextDouble();
        a=pie*r*r;
        System.out.println(a);
        
    }
}
