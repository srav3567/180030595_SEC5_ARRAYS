package Abstraction;

interface Caluc1{
	abstract int add(int a,int b);
	abstract int sub(int a,int b);
}
interface Caluc2 extends Caluc1{
	abstract int mul(int a,int b);
	abstract double div(int a,int b);
}

class caluc implements Calu2{
	public int add(int a,int b) {
		return a+b;
	}
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
public class Multipleinheritance1 {
	public static void main(String[] args) {
		calImp i=new calImp();
		System.out.println(i.add(3,4));
	}
}
