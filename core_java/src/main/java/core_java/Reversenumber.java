package core_java;

public class Reversenumber {

	public static void main(String[] args) {
int n=456;
int x=0;
do{
	int r=n%10;
	x=x+r;
	x=x*10;
	n=n/10;


	}
while(n>0);
System.out.println(x/10);
}
}