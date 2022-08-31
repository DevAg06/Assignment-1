import java.util.Scanner;

class volofcylinder{
	public static void main(String[] args){
		double vol,pie=3.14,r,h;
		System.out.println("Enter the base radius :");
		Scanner sc1 = new Scanner(System.in);
		r = sc1.nextDouble();
		System.out.println("Enter the height :");
		Scanner sc2 = new Scanner(System.in);
		h = sc2.nextDouble();
		vol=(pie)*r*r*h;
		System.out.println(vol);
}
}