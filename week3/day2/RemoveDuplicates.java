package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		System.out.println(split);
		for (int i = 0; i < split.length; i++) {
			//System.out.println(split[i]);
			for (int j = 0; j < i; j++) {
				if(split[i].equals(split[j])) {
						split[j]="";
				
					
				}
					}
			
				}
				for (int k = 0; k < split.length; k++) {
					if (split[k] != "")
					System.out.println(split[k]);
				}
			}
			
			
		}
		
	


