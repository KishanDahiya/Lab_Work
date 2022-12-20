package Lab1;

class Student{
	String usn,name,course,college;
	
	Student(){
			}
	//Constructor of student class
	Student(String usn, String name, String course, String college){
		this.usn=usn;
		this.name=name;
		this.course=course;
		this.college=college;
				}
	//Displaying the content
	void displayStudent() {
		System.out.println("USN : "+this.usn);
		System.out.println("Name : "+this.name);
		System.out.println("Course : "+this.course);
		System.out.println("College : "+this.college);
	}	
}