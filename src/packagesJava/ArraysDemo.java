package packagesJava;


public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	int[] myintArray = new int [10];
	
 // myintArray[0] = 100;
//  myintArray[1] = 200;
//  myintArray[2] = 300;
	
//  System.out.println("Array index 0 - "+ myintArray[0]);
//  System.out.println("Array index 1 - "+ myintArray[1]);
//  System.out.println("Array index 2 - "+ myintArray[2]);
//  System.out.println("Array index 3 - "+ myintArray[3]);
	
//	String[] myStringArray = new String[10];
	
//	myStringArray[0] = "BMW";
//	myStringArray[1] = "Audi";
//	myStringArray[2] = "benz";
//	
//	System.out.println("Array index 0 - " + myStringArray[0]);
//	System.out.println("Array index 1 - " + myStringArray[1]);
//	System.out.println("Array index 2 - " + myStringArray[2]);
//	System.out.println("Array index 3 - " + myStringArray[3]);
	
	String[] myStringArray = {"BMW", "Audi", "Benz"};
	
	int len = myStringArray.length;
	
	for(int i = 0; i < len; i++)  {
	System.out.println("Array index " + i +" - "+ myStringArray[i]);
	}

	
	
	}

}
