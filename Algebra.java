// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	     //Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		// Replace the following statement with your code
		if(x2>0)
		{
		for(int i=0;i<x2;i++)
		{
			x1++;
		}
		return x1;
		}
		else {
			for(int i=0;i>x2;i--)
		{
			x1--;
		}
		return x1;
		}
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		// Replace the following statement with your code
		if(x2>0)
		{
		for(int i=0;i<x2;i++)
		{
			x1--;
		}
		return x1;
	}
	else{
		for(int i=0;i>x2;i--)
		{
			x1++;
		}
		return x1;
	}
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		// Replace the following statement with your code
		int t=0,tX1=x1,tX2=x2,result=0;
		if(x1==0|| x2==0)
			return 0;
		if(x2>0&&x1>0){
		 t=x1;
		for(int i=1;i<x2;i++)
		{
			t=plus(t,x1);
		}
		return t;
	}
		if (x1<0&&x2<0)
		{
			tX1=minus(tX1, x1);
			tX1=minus(tX1, x1);
			tX2=minus(tX2, x2);
			tX2=minus(tX2, x2);
			return times(tX1,tX2);
		}
		if (x1<0)
		{
			tX1=minus(tX1, x1);
			tX1=minus(tX1, x1);
			t= times(tX1,x2);
			result=t;
			result = minus(result,t);
			result = minus(result,t);
			return result;
		}
		tX2=minus(x2, x2);
		tX2=minus(tX2, x2);
		t= times(x1,tX2);
		result=t;
		result = minus(result,t);
		result = minus(result,t);
		return result;
	


	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		// Replace the following statement with your code
		int t=x;
		if(n==0)
			return 1;
		for(int k=1;k<n;k++)
		{
			t=times(t,x);
		}
		return t;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		// Replace the following statement with your code
		int count=0,t=0,result=0,tX1=x1,tX2=x2;
		if(x1>=0&&x2>0)
		{
		if(x1<x2)
			{
				return 0;
			}
		while(x1>=x2)
		{
			x1=minus(x1,x2);
			count++;
		}
		return count;
		}
		if(x1<0&&x2<0)
		{
			tX1=minus(tX1, x1);
			tX1=minus(tX1, x1);
			tX2=minus(tX2, x2);
			tX2=minus(tX2, x2);
			return div(tX1,tX2);
		}
		if(x1<0)
		{
			tX1=minus(tX1, x1);
			tX1=minus(tX1, x1);
			t= div(tX1,x2);
			result=t;
			result = minus(result,t);
			result = minus(result,t);
			return result;
		}
		tX2=minus(x2, x2);
		tX2=minus(tX2, x2);
		t= div(x1,tX2);
		result=t;
		result = minus(result,t);
		result = minus(result,t);
		return result;


	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		// Replace the following statement with your code
		int tX1=x1,tX2=x2;
		if(x1>=0&&x2>0)
		{
		if(x1<x2)
			{
				return x1;
			}
		while(x1>=x2)
		{
			x1=minus(x1,x2);
		}
		return x1;
	    }
		if(x1<0&&x2<0)
		{
			tX1=minus(tX1, x1);
			tX1=minus(tX1, x1);
			tX2=minus(tX2, x2);
			tX2=minus(tX2, x2);
			return mod(tX1,tX2);
		}
		if(x1<0)
		{
			tX1=minus(tX1, x1);
			tX1=minus(tX1, x1);
			return div(tX1,x2);
		}
		tX2=minus(x2, x2);
		tX2=minus(tX2, x2);
		return div(x1,tX2);

	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		// Replace the following statement with your code
		if(x==1)
			return 1;
		for(int i=0;i<x;i++)
		{
			if(times(i,i)>x)
				return i-1;
			if(times(i,i)==x)
				return i;	
		}
		return 0;
	}	  	  
}