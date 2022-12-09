package fromTheBeginning;

public class ForLoop {

	public static void main(String[] args) {
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
	}}

