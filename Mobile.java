package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel = "iphone";
		float mobileWeight = 2.51f;
	System.out.println(mobileModel);
	System.out.println(mobileWeight);	
		
	}
		public void sendMsg() {
			boolean isFullCharged = true;
			System.out.println(isFullCharged);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my mobile");
  Mobile obj = new Mobile();
  obj.makeCall();
  obj.sendMsg();
	
}
	

}
