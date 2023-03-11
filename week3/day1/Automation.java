package week3.day1;

public class Automation extends MultipleLanguage implements Language, TestTool
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Automation automate = new Automation();
automate.java();
automate.selenium();
automate.phyton();
automate.ruby();
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
	}

}
