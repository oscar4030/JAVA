package kms;


import java.util.Scanner;
public class kms {
	public static boolean circleDistance(int x1, int y1, int x2, int y2, double radius1, double radius2)
	{
		
		
		double distance=((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		double distance_2=Math.sqrt(distance);
		
		if(distance_2>=(radius1+radius2))return true; //������ ���� �ͺ��� ũ�ų� ���� == ��ġ���ʴ´�
		else return false; //������ ���� �ͺ��� �۴� == ��ģ�� 
	}
	
	public static void main(String arg[])
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		int x1=scanner.nextInt();
		int y1=scanner.nextInt();
		double radius1=scanner.nextDouble();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		int x2=scanner.nextInt();
		int y2=scanner.nextInt();
		double radius2=scanner.nextDouble();
		
		boolean answer=circleDistance(x1, y1, x2, y2, radius1, radius2);
		if(answer==true) System.out.print("�� ���� ��ġ�� �ʽ��ϴ�");
		else System.out.print("�� ���� ���� ��ģ��");
		
		scanner.close();
	}
}

