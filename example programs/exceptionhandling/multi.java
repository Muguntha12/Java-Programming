package Base;
import java.util.*;
class math
 {
	int a = 20;
	int b = 10;
	void display()
	{
		System.out.println("Multiplication",+a);
	}
}
class add extends math
{
	void print()
	{
		System.out.println("add="+(a+b));
	}
}
class sub extends math
{
	void p()
	{
		System.out.println("sub="+(a-b));
	}
}
class mul extends math
{
	void q()
	{
		System.out.println("Mul="+(a*b));
	}
}
class div extends math
{
	void r()
	{
		System.out.println("Div="+(a/b));
	}
}
class multi
{
	public static void main(String[] args)
	{
		add a = new add();
		sub s = new sub();
		mul m = new mul();
		div d = new div();
		a.print();
		s.p();
		m.q();
		d.r();
	}
}
