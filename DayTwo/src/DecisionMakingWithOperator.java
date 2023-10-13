
public class DecisionMakingWithOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
		int y=7;
		int a=10;
		int b=11;
		
		if (x>=y) {
			System.out.println("true");
			
		}
		else {
			System.out.println("false");
		}
		//bitwise (or)will have single pipe operator
		//logical (or)will have double pipe operator
		//bitwise (and)will have single & operator
		//logical (and) will have double & operator
		if ((a<b)|| (a==b)) //output to be true with logical (or)false as truth table either of input is true the output will be true 
				//(!) indicates not
			if (!(a<b)|| (a==b)) // input is false and output will be also false
				//not will applies only for frst expression not for whole expression
				{
			System.out.println("true");
			
		}
		else {
			System.out.println("false");
		}
	}

}
