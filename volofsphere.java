import java.util.Scanner;
class volofsphere{
	public static void main(String[] args){
		double r,vol,pie=3.14,a=1.333;
		System.out.println("enter the radius :");
		Scanner sc =new Scanner(System.in);
		r=sc.nextDouble();
		vol=a*pie*r*r*r;
		System.out.println(vol);		
}
}