package Lab1;

import java.util.*;

public class Lab1BAL {
	
	//Created the ArrayList and Returned
	public List<Student> create(){
		List<Student> l=new ArrayList<Student>();
		return l;
	}
	
	//Putting in the values
	public List<Student> addValues(List<Student> l){
		int counter,i = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements do you want to add : ");
		counter = sc.nextInt();
		while(i<counter) {
			System.out.println("Add Elements in order USN,Name, Course, College "+(i+1));
			l.add(new Student(sc.next(),sc.next(),sc.next(),sc.next()));
			i++;
		}
		return l;
	}
	
	//Display elements
	public void display(List<Student> l) {
		Iterator<Student> itr1=l.iterator();
		while(itr1.hasNext()) {
			Student s2=itr1.next();
			s2.displayStudent();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Created an object to call all methods
		Lab1BAL obj=new Lab1BAL();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		//Created a list to copy all elements after each operation
		List<Student> list=new ArrayList<Student>();
		//Menu Driven
		while(true) {
			System.out.println("\n1.Create ArrayList\n"
					+ "2.Insert Values\n"
					+ "3.Display Values\n"
					+ "4.Remove Value\n"
					+ "5.Search Value\n"
					+ "6.Size of ArrayList\n"
					+ "Press 0 to exit\n"
					+ "Enter your choice : ");
			choice=sc.nextInt();
			if(choice==1) {
				list.addAll(obj.create());
				System.out.println("Created the object");
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
				for(Student st:list) {
					if(st.usn.equals(sc.next())) {
						System.out.println("\nYes found!!!");
					}else {
						System.out.println("\nNot found!!!");
					}
				}
				
			}else
			if(choice==6) {
				System.out.println("\nSize of ArrayList is :"+list.size());
			}else
			if(choice==0) {
				break;
			}
			
		}
		
	}

}