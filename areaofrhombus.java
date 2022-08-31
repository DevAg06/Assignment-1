import java.util.Scanner;
public class areaofrhombus {
    public static void main(String[] args) {
        double d1,d2,area;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the diagonal1 :");
        d1=sc1.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the diagonal2 :");
        d2=sc2.nextDouble();
        area=0.5*d1*d2;
        System.out.println(area);
        
    }
}
