import java.util.Scanner;

class csaofcylinder{
	public static void main(String[] args){
		double r,h,csa,pie=3.14;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the radius of cylinder :");
		r = sc1.nextDouble();
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter the height of cylinder :");
		h = sc2.nextDouble();
		csa=2*pie*r*h;
		System.out.println(csa);		
}
}