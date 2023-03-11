package week3.day1;

public class Students {
public void getStudentInfo(int id) {
	System.out.println(id);
}
public void getStudentsInfo(int id, String name) {
	System.out.println(id+" "+name);
}
public void getStudentsInfo(String email, Long phoneNum) {
	System.out.println(email+" "+phoneNum);
}
public static void main(String[] args) {
	Students stu = new Students();
	stu.getStudentsInfo(123,"Hari" );
	stu.getStudentInfo(123);
	stu.getStudentsInfo("sivam@gmail.com", 1234567890L);
}
}
