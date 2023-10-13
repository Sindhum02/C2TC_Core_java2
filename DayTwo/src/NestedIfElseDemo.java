
public class NestedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b= 20;
		int c=5;
		System.out.println("the largest number is :");
		//nested ifelse is that ifelse part is inside if and else
		if (a>b) {
		//	if condition works then below if & else condition works
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);
			
		}
		else {
			if(c>b)
				System.out.println(c);
			else
				System.out.println(b);
		}

	}

}
