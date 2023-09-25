package Mypackage;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=62;
		int B=7;
		int D;
		int Q;
		while(B!=0)
		{
			D=A%10;
			Q=A/10;
			D=D*10;
			A=D+Q;
			A=A+1;
			B=B-1;
		}
		System.out.println(A);

	}

}
