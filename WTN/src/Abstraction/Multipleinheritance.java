package Abstraction;

interface Calu1{
	abstract int add(int a,int b);
	abstract int sub(int a,int b);
}
interface Calu2{
	abstract int mul(int a,int b);
	abstract double div(int a,int b);
}

class calu implements Calu1,Calu2{
	@Override
	public int add(int a,int b) {
		return a+b;
	}
	@Override
	public int sub(int a,int b) {
		return a-b;
	}
	@Override
	public int mul(int a,int b) {
		return a*b;
	}
	@Override
	public double div(int a,int b) {
		return a/b;
	}
}
public class Multipleinheritance {
	public static void main(String[] args) {
		calImp i=new calImp();
		System.out.println(i.add(3,4));
	}
}
