import java.util.Scanner;
class volofcube{
	public static void main(String[] args){
		float s,vol;
		System.out.println("enter the side of cube :");
		Scanner sc =new Scanner(System.in);
		s=sc.nextFloat();
		vol=s*s*s;
		System.out.println(vol);		
}
}