package base;

public class MyInteger {
	//stores the int value     
	//test
	private int iValue;
// Constructor which creates an object for the int value
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}
// Method that Returns iValue
	public int getiValue() {
		return iValue;
	}
// Is integer even?
	public boolean isEven() {
		if (iValue % 2 ==0) {
			return true;
		}
		return false;
	}
	// Is integer odd?
	public boolean isOdd() {
		if (iValue % 2 !=0){
			return true;
		}
		return false;
	}
	// Is integer prime?
	public boolean isPrime(){
		int i=0;
		for (i=2; i<= iValue/2; i++){
			if (iValue% i==0){
				return false;
				
			}
		}
		return true;
	}
	public static boolean isOdd(int iValue) {
		int oddRemainder;
		oddRemainder = iValue % 2;
		if (oddRemainder == 0) {
			return false;
		} else {
			return true;
		}
	}
// static methods
	//Static is even
	public static boolean isEven(int iValue) {
		return (iValue % 2==0);
	}
	//static is prime
	public static boolean isPrime( int iValue){
		for (int j=2; j<iValue/2; j++){
			if (iValue % j !=0){
				return true;
			}
		}
		return false;
	}
	
	//boolean even testing
	public static boolean isEven(MyInteger m){
		return m.isEven();
	}
	public static boolean isOdd(MyInteger m){
		return m.isOdd();
	}
	public static boolean isPrime(MyInteger m){
		return m.isPrime();
	}
	public boolean equals(MyInteger m){
		return equals(m.getiValue());
	}
	public boolean equals(int m) {
		return (iValue ==m);		
	}
	
}
			
