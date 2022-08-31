import java.util.Scanner;

class csaofcone{
	public static void main(String[] args){
		double csa,pie=3.14,r,l;
		System.out.println("Enter the length of cone :");
		Scanner sc1 = new Scanner(System.in);
		l= sc1.nextDouble();
		System.out.println("Enter the base radius  :");
		Scanner sc2 = new Scanner(System.in);
		r = sc1.nextDouble();
		csa = 2*(pie)*r*l;
		System.out.println(csa);
}
}