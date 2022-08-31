import java.util.Scanner;

class volofpyramid{
	public static void main(String[] args){
		int l,w,h,vol;
		System.out.println("Enter the length :");
		Scanner sc1 = new Scanner(System.in);
		l= sc1.nextInt();
		System.out.println("Enter the base width :");
		Scanner sc2 = new Scanner(System.in);
		w= sc1.nextInt();
		System.out.println("Enter the height :");
		Scanner sc3 = new Scanner(System.in);
		h= sc1.nextInt();
		vol = l*w*h/3;
		System.out.println(vol);
}
}