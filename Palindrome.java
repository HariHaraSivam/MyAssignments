package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "madam", rev = "";
for (int i = s.length()-1; i  >= 0; i--) {
	rev += s.charAt(i);
}
System.out.println(rev);
if(s.equals(rev)) {
	System.out.println("It is palindrome");
}
}

}
