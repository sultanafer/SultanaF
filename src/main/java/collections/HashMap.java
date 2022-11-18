package collections;

public class HashMap {

	public static void main(String[] args) {
		
				// Maintains random order
				 
				Map<String, Integer>st=new HashMap<String, Integer>();
				st.put("Mark", 123);
				st.put("Max", 124);
				st.put("Maria", 223);
				st.put("Mary", 113);
				st.put("Carl", 133);
				st.put("Cavin", 124);
				st.put("Jeren", 523);
				st.put("Franko", 623);
				 //get count of map entry-size
				st.size();
				System.out.println(st.size());
				//To get
				System.out.println(st.get("Mark"));
				//
				System.out.println(st.entrySet());
				//Remove a particular item
				System.out.println(st.remove("Carl", 133));
				//Contains()
				System.out.println(st.containsKey("Calvin"));
				System.out.println(st.containsKey(623));
				
				for(Entry<String, Integer> eachst:st.entrySet()) {
					System.out.println(eachst);
					
				}
				
				st.clear();
				System.out.println(st.isEmpty());
				System.out.println(st.size());

				st.put("Keya", 345);
				st.put("Maya", 445);
				st.put("Shia", 545);
				st.put("Nila", 645);
				st.put("Keya", 745);
				System.out.println(st.entrySet());

			}

		}
	/*	package collections_Map;

		import java.util.Map;
		import java.util.Map.Entry;
		import java.util.TreeMap;

		public class Tree_Map {

			public static void main(String[] args) {
				// Maintains ascending order
				
				Map<String, String> emp=new TreeMap<String, String>();
				
				emp.put("Anila", "hoque");
				emp.put("Sharif", "Islam");
				emp.put("Saiful", "Islam");
				emp.put("Ripa", "Islam");
				emp.put("Ainun", "Nahar");
				emp.put("Mahin", "Sultana");
				emp.put("Shahid", "Uddin");
				emp.put("Shanta", "Rahman");
				
				System.out.println(emp.size());
				System.out.println(emp.entrySet());
				System.out.println(emp.containsKey("Ripa"));
				emp.remove("Saiful");
				System.out.println(emp.containsKey("Saiful"));

				for(Entry<String, String> eachemp:emp.entrySet()) {
					//System.out.println(eachemp);
					System.out.println("FirstName:"+eachemp.getKey()+ " LastName:"+eachemp.getValue());
				}
				emp.clear();
				System.out.println(emp.isEmpty());
				System.out.println(emp.size());

			}

		}*/
		/*package collection_Map;

		import java.util.LinkedHashMap;
		import java.util.Map;
		import java.util.Map.Entry;

		public class Linked_HashMap {
			
			public static void main(String[] args) {
				// Maintains order of put/insert
				
				Map<String, Integer> list=new LinkedHashMap<String, Integer>();
				list.put("Books", 123);
				list.put("Pens", 123);
				list.put("Pencil", 123);
				list.put("Notebook", 123);
				list.put("Papers", 123);
				list.put("Erazers", 123);
				list.put("Sherpners", 123);
				list.put("PostIts", 123);
				list.put("Binders", 123);
				list.put("Folders", 123);
				
				System.out.println(list.size());
		        System.out.println(list.entrySet());
		        
		        for(Entry<String, Integer> eachlist:list.entrySet()) {
		        	System.out.println(eachlist.getKey()+" "+eachlist.getValue());
		        	
		        	list.clear();
		    		System.out.println(list.isEmpty());
		    		System.out.println(list.size());


		        }

			}

		}
		[7:26 PM, 10/6/2022] +1 (732) 429-6742: package collection_Map;

		import java.util.LinkedHashMap;
		import java.util.Map;
		import java.util.Map.Entry;

		public class Linked_HashMap {
			
			public static void main(String[] args) {
				// Maintains order of put/insert
				
				Map<String, Integer> list=new LinkedHashMap<String, Integer>();
				list.put("Books", 123);
				list.put("Pens", 123);
				list.put("Pencil", 113);
				list.put("Notebook", 133);
				list.put("Papers", 1234);
				list.put("Erazers", 223);
				list.put("Sherpners", 312);
				list.put("PostIts", 122);
				list.put("Binders", 323);
				list.put("Folders", 153);
				
				System.out.println(list.size());
		        System.out.println(list.entrySet());
		        
		        for(Entry<String, Integer> eachlist:list.entrySet()) {
		        	System.out.println(eachlist.getKey()+" "+eachlist.getValue());
		        	
		        	list.clear();
		    		System.out.println(list.isEmpty());
		    		System.out.println(list.size());


		        }

			}

		}

	}

}*/
