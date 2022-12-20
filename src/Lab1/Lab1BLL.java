package Lab1;
import java.util.*;

public class Lab1BLL {
	
	//Created the LinkedList and Returned
	public List<Employee> create(){
		List<Employee> l=new LinkedList<Employee>();
		System.out.println("Created the object");
		return l;
	}
	
	//Putting in the values
	public List<Employee> addValues(List<Employee> l){
		int counter,i = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements do you want to add : ");
		counter = sc.nextInt();
		while(i<counter) {
			System.out.println("Add Elements in order Eid, Name, Department, Address "+(i+1));
			l.add(new Employee(sc.next(),sc.next(),sc.next(),sc.next()));
			i++;
		}
		return l;
	}
	
	//Display elements
	public void display(List<Employee> l) {
		Iterator<Employee> itr1=l.iterator();
		while(itr1.hasNext()) {
			Employee s2=itr1.next();
			s2.displayEmployee();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Created an object to call all methods
		Lab1BLL obj=new Lab1BLL();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		//Created a list to copy all elements after each operation
		List<Employee> list=new LinkedList<Employee>();
		//Menu Driven
		while(true) {
			System.out.println("\n1.Create LinkedList\n"
					+ "2.Insert Values\n"
					+ "3.Display Values\n"
					+ "4.Remove Value\n"
					+ "5.Search Value\n"
					+ "6.Size of ArrayList\n"
					+ "7.Add first\n"
					+ "8.Add Last\n"
					+ "9.Remove First\n"
					+ "10.Remove Last\n"
					+ "Press 0 to exit\n"
					+ "Enter your choice : ");
			choice=sc.nextInt();
			if(choice==1) {
				list.addAll(obj.create());
				}else
			if(choice==2) {
				list.addAll(obj.addValues(list));
			}else
			if(choice==3) {
				obj.display(list);
			}else
			if(choice==4) {
				System.out.println("\nEnter the value to remove :");
				list.remove(sc.next());
			}else
			if(choice==5) {
				
				System.out.println("\nEnter the value to search :");
				if(list.contains(sc.next())) {
					System.out.println("\nYes found!!!");
				}else {
					System.out.println("\nNot found!!!");

				}
			}else
			if(choice==6) {
				System.out.println("\nSize of ArrayList is :"+list.size());
			}else
			if(choice==7) {
				System.out.println("\n");
			}
			else
			if(choice==0) {
				break;
			}
			
		}
		
	}

}