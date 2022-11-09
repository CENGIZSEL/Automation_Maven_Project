package java_session_5thNovember_2022;

public class Boxing_Unboxing {

	//The integer class wraps a value of the primitive type int in an object
	public static void main(String[] args) {
//Boxing (do this manually) conversion of the primitive to wrapper class object
		int x = 20;
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		
		//Autoboxing
		
		int a =100;
		Integer b = a;
		System.out.println(b);
		
		//Unboxing  -  conversion of wrapper class object to primitive 
		
		Integer result = 50;
		int newResult = result.intValue();
System.out.println(newResult);

//AutoUnboxing
Integer marks = 90;
int newMarks = marks;
System.out.println(newMarks);

	}

}
