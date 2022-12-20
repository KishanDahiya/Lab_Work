//Write a Java program which demonstrates Generic with key and value.
//Create a map of key(States of India) value(State capital) pairs.
//Demonstrate various methods such as get, put and set operations.
//Sort based on key for treemap and hashmap.


package Lab1;
import java.util.*;
import java.util.Map.Entry;

public class Lab1A {
	Scanner sc = new Scanner(System.in);

	//Putting the values
	void putValues(Map<String,String> map1) {
		System.out.println("How many values you want to enter :");
		int n = sc.nextInt();
		System.out.println("Enter the values");
		int counter=0;
		while(counter<n) {
			String state,capital=" ";
			System.out.println("State :");
			state=sc.next();
			System.out.println("Capital :");
			capital=sc.next();
			map1.put(state, capital);
			counter++;
		}
		System.out.println("Values Entered Succesfully!!!");		
	}
	
	//Getting Values based on key
	void getValues(String key, Map<String,String> map1) {
		System.out.println("The value of key '"+key+"' is : "+map1.get(key));
	}
	
	
	//Sorting method
	public void sort(Map<String,String> map1)
    {
		System.out.println("Select\n1.Sort by Keys\n2.Sort by Values");
		int ch=sc.nextInt();
		if(ch==1) {
			// TreeMap to store values of HashMap
	        TreeMap<String, String> sorted = new TreeMap<>();
	         // Copy all data from hashMap into TreeMap
	        sorted.putAll(map1);
	         // Display the TreeMap which is naturally sorted
	        System.out.println(sorted);     

	     // Display the TreeMap which is naturally sorted
	        for (Map.Entry<String, String> entry : sorted.entrySet())
	            System.out.println("Key = " + entry.getKey() +
	                         ", Value = " + entry.getValue());
		}else
		if(ch==2){
			//Object of LinkedList Created
	        List<Map.Entry<String, String>> list = new LinkedList<Map.Entry<String,String>>(map1.entrySet());
	        //Sorting using Lambda functions
	        Collections.sort(list,(i1,i2)-> i1.getValue().compareTo(i2.getValue()));
	        //Put data from sorted list to hashmap
	        HashMap<String, String> temp = new LinkedHashMap<String, String>();
		    for (Entry<String, String> aa : list) {
		        temp.put(aa.getKey(), aa.getValue());
		        }
		    for (Entry<String, String> en :temp.entrySet()) {
	           System.out.println("Key = " + en.getKey()+ ", Value = "+ en.getValue());
	       }
		}
    		
    }
	
		
	//Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice=0;
		Lab1A obj = new Lab1A();
		Map<String,String> map1;

		//Creating respective Map Objects
		System.out.println("Press 1 for Hashmap\nPress 2 for Treemap");
		choice=sc.nextInt();
		if(choice==1) {
			map1=new HashMap<>();
		}else {
			map1=new TreeMap<>();
		}
		
		//Menu for Put, Get Operations
		while(true) {
			System.out.println("Type of element is "+map1.getClass().getName());
			System.out.println("\n1.Put Values\n"
					+ "2.Get Values\n"
					+ "3.Size of Map object\n"
					+ "4.Display only Keys\n"
					+ "5.Display only values\n"
					+ "6.Display Map as set\n"
					+ "7.Update the value\n"
					+ "8.Sort the Map\n"
					+ "9.Display the Map\n"
					+ "Press 0 to exit");
			choice=sc.nextInt();
			if(choice==1) {
				obj.putValues(map1);
			}else 
			if(choice==2) {
				System.out.println("Enter the key you want value for : ");
				String key=sc.next();
				obj.getValues(key,map1);
			}else 
			if(choice==3) {
				System.out.println("The size of the Map is : "+map1.size());
			}else
			if(choice==4) {
				System.out.println("The Map Keys are : "+map1.keySet());

			}else
			if(choice==5) {
				System.out.println("The Map Values are : "+map1.values());

			}else
			if(choice==6) {
				Set<Entry<String,String>> set1=map1.entrySet();
				System.out.println("The Map set is : "+set1);	
			}else
			if(choice==7) {
				System.out.println("Enter the key : ");
				String state=sc.next();
				map1.remove(state);
				
			}else
			if(choice==8) {
				obj.sort(map1);
			}else
			if(choice==9) {
				System.out.println(map1);
			}else
			if(choice==0) {
				break;
			}

		}
	}

}