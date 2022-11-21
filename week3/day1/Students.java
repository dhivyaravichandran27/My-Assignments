package week3.day1;

public class Students {
	public void getStudentInfo(int id){
		System.out.println("Student id is " +id);
	}
	public void getStudentInfo(int id,String name){
		System.out.println("Student id is " +id);
		System.out.println("Student name is " +name);
	}
	public void getStudentInfo(String email, String phoneNumber){
		System.out.println("Student email id is "+email);
		System.out.println("Student phone number is "+ phoneNumber);
	}
	
	
public static void main(String[] args) {
		Students stu =new Students ();
		stu.getStudentInfo(101);
		stu.getStudentInfo(102, "Raja");
        stu.getStudentInfo("testing@yopmail.com", "9876543210"); 
	}
}
