package fromTheBeginning;

public class DoLoop {

	public static void main(String[] args) {

		//print 1 to 10
		for(int i=1; i<=10;i=i+1) {
			System.out.println(i);
		}
		System.out.println("*******************");
		
		for(int j=1; j <= 50; j=j+2) {
			System.out.println(j);
		}

System.out.println("*******************");

		//Print all the values from below Arrays (obj) by using while loop
		String[] obj = new String[6];
		obj[0] = "Atiq";
		obj[1] = "Meem";
		obj[2] = "Rosy";
		obj[3] = "Shafin";
		obj[4] = "Mamun";
		obj[5] = "xyz";

		//By using loops we can performs various actions/thing

		for(int i=0;i<obj.length; i=i+1) {

			//System.out.println(i);	//For printing all index number

			//System.out.println(i +" United State of America"); //printing "United State of America"multiple times with index number 
			System.out.println(obj[i]); // Printing all values from array 
		}	

	}	
}


public class WhileLoop {

	public static void main(String[] args) {
		
		//while loop

		/*initializan;
		while(condition){
		Statement(s);
		incerment;
		}*/
		
		//If I will print 1 to 10, using While loop
		
		int i=1; // start
		while(i<=10) {
			System.out.println(i);
			i++; //increment
		}
		
		System.out.println("...........................");
		
		//Print all the values from below Arrays (obj) by using while loop
		String[] obj = new String[4];
		obj[0] = "Rumman";
		obj[1] = "shihab";
		obj[2] = "Mamun";
		obj[3] = "xyz";
		
	int j=0;
		while(j<=3) {
			System.out.println(obj[j]);
			j++;
		}
}
}
[12:04 AM, 9/14/2022] Mamunur R Chowdhury: package javaDemo;

public class DoWhileLoop {
	
	public static void main(String[] args) {

		//do while loop
		
		/*initializan;
		do{
		Statement(s);
		increment;
		}while(condition);*/

		//It will print 1 to 10, using do while loop
		//if you don't use increment [i++] in while or do while loop, it will run infinite times, that is it will never ends
		
		int i=1; //start
		do {
			System.out.println(i);
			i++;
		}while(i<=10);

	}

}


public class ForEachLoop {

	public static void main(String[] args) {

		//for each loop
		//Syntax
		/*for(DataType eachCollections : Collection){
					Statement(eachCollections );
					}*/
		String [] Args= {"Meem", "Javed", "Mamun"};

		for (String eachArgs : Args) {
	System.out.println(eachArgs);
}

		//print all values from below nums Arrays using for each loop.
		//Example-1
		int[] nums = {10,20,30,40,50,60,70};

		for (int eachNums : nums) {

			System.out.println(eachNums);
		}
			System.out.println(nums.length);
			
		System.out.println("...............................");

		//print all values from below names Arrays using for each loop.
		//Example-2

		String[] names = {"rumel", "lipee", "abcd", "rosy","neepa","rumi","milton","bely"};

		for(String eachNames : names ) {
			System.out.println(eachNames);
		}
		System.out.println(".................................");

		//print all values from below emp Arrays using for each loop.
		//Example-3
		String[] emp = new String[4];
		emp[0] = "Rumman";
		emp[1] = "shihab";
		emp[2] = "Mamun";
		emp[3] = "xyz";

		for(String eachEmp : emp ) {
			System.out.println(eachEmp);
		}
		System.out.println(".....................................");

		//we can print all values from nums Arrays by using for-loop too.
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
[12:30 AM, 9/15/2022] Mohammad Atiqur Rahman: package javaDemo;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//print 1 to 10
		for(int i=1;i<=10;i=i+1) {
			System.out.println(i);
		}
	for(int j=1;j<=50;j=j+2){
		System.out.println(j);
	}
	
	//Print all the values from bellow Arrays(obj)by using while loop
	String[]obj=new String[6];
			obj[0]="Atique";
	        obj[1]="Anusha";
	        obj[2]="Shampa";
	        obj[3]="Shad";
	        obj[4]="Kamal";
	        obj[5]="Shahanaz";
	        
	   for(int i=0;i<obj.length;i=i+1) {
		   System.out.println(obj[i]);


	}

}
