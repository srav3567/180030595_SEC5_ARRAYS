package Abstraction;

abstract class Calculator{
	abstract int add(int a,int b);
	abstract int sub(int a,int b);
	abstract int mul(int a,int b);
	abstract double div(int a,int b);
}

class calImp extends Calculator{
	@Override
	int add(int a,int b) {
		return a+b;
	}
	@Override
	int sub(int a,int b) {
		return a-b;
	}
	@Override
	int mul(int a,int b) {
		return a*b;
	}
	@Override
	double div(int a,int b) {
		return a/b;
	}
}
public class Calmain {
	public static void main(String[] args) {
		calImp i=new calImp();
		System.out.println(i.add(3,4));
	}
}
