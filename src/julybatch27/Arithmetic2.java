package julybatch27;

public class Arithmetic2 {
	public int div (int a1, int b1)
	{
		int c1 = a1/b1;
				System.out.println("Result is "+c1);
		return c1;
	}
	public int sub (int a2, int b2)
	{
		int c2 = a2-b2;
		System.out.println("Result is "+c2);
		return c2;
	}
	public int multi (int a3, int b3)
	{
		int c3 = a3*b3;
		System.out.println("Result is "+c3);
		return c3;
	}
	public void add (int a4, int b4)
	{
		int c4 = a4+b4;
		System.out.println("Result is "+c4);
	}
	public static void main(String[] args) {
		Arithmetic2 obj2 = new Arithmetic2();
		int divresult = obj2.div(10, 2);
		int subresult1 = obj2.sub(divresult, 2);
		int multiresult = obj2.multi(subresult1, 2);
		int subresult2 = obj2.sub(multiresult, 2);
		obj2.add(subresult2, 2);
	
		
	}

}
