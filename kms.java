package kms;


import java.util.Scanner;
public class kms {
	public static boolean circleDistance(int x1, int y1, int x2, int y2, double radius1, double radius2)
	{
		
		
		double distance=((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		double distance_2=Math.sqrt(distance);
		
		if(distance_2>=(radius1+radius2))return true; //반지름 더한 것보다 크거나 같다 == 겹치지않는다
		else return false; //반지름 더한 것보다 작다 == 겹친다 
	}
	
	public static void main(String arg[])
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int x1=scanner.nextInt();
		int y1=scanner.nextInt();
		double radius1=scanner.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int x2=scanner.nextInt();
		int y2=scanner.nextInt();
		double radius2=scanner.nextDouble();
		
		boolean answer=circleDistance(x1, y1, x2, y2, radius1, radius2);
		if(answer==true) System.out.print("두 원은 겹치지 않습니다");
		else System.out.print("두 원은 서로 겹친다");
		
		scanner.close();
	}
}

