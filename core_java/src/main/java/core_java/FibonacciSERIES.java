package core_java;

public class FibonacciSERIES {

	public static void main(String[] args) {
		
	int a=0;
	int b=1;
	int c=1;
 for(int i=1;i<10;i++) {  
	  System.out.println(a);  
	  c=a+b;
	  a=b;    
	  b=c;
	}
	}
}
