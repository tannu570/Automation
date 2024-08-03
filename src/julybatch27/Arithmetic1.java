package julybatch27;

public class Arithmetic1 {
	
        public int sum (int a1, int b1)
        {
         int c1 = a1+b1;
         System.out.println("result is "+c1);
         return c1;
        }
        public int multi (int a2, int b2)
        {
        	int c2 = a2*b2;
        	System.out.println("result is "+c2);
        	return c2;
        }
        public int sub (int a3, int b3) 
        {
        	int c3 = a3-b3;
        	System.out.println("result is "+c3);
        	return c3;
        }
        public void div (int a4, int b4)
        {
        	int c4 = a4/b4;
        	System.out.println("result is "+c4);	
        }
        	public static void main(String[] args) {
			Arithmetic1 obj1 = new Arithmetic1();
			int sumresult1 = obj1.sum(10, 2);
			int multiresult1 = obj1.multi(sumresult1, 2);
			int subresult = obj1.sub(multiresult1, 2);
			int multiresult2 = obj1.multi(subresult, 2);
			obj1.div(multiresult2, 2);
		}
}
