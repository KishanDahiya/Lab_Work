package Lab1;

class Employee{
	String eid,name,department,address;
	
	Employee(){
			}
	//Constructor of student class
	Employee(String eid, String name, String department, String address){
		this.eid=eid;
		this.name=name;
		this.department=department;
		this.address=address;
				}
	//Displaying the content
	void displayEmployee() {
		System.out.println("Employee ID : "+this.eid);
		System.out.println("Name : "+this.name);
		System.out.println("Department : "+this.department);
		System.out.println("Address : "+this.address);
	}	
}