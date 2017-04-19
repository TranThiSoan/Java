package btcn1;

import java.util.Scanner;

public class Phuongtrinhbacnhat {

	public static void main(String[] args) {
		
		int a;
		int b;
		a=Nhapsonguyen("Nhap he so a: ");
		b=Nhapsonguyen("Nhap he so b: ");
		Giaiptbac1(a,b);
	}
	public static int Nhapsonguyen(String str)
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println(str);
		x=sc.nextInt();
		return x;
	}
	public static void Giaiptbac1(int a, int b)
	{
		if(a==0)
		{
			if(b==0)
				System.out.println("Phuong trinh vo so nghiem");
			else
				System.out.println("phuong trinh vo nghiem");
		}	
		else
			System.out.println("phuong trinh co nghiem x= "+(-b/a));
	}
}
