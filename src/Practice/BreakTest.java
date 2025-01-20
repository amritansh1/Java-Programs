package Practice;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				if(j==0)
					break;
			}
			System.out.println("Outside j"+i);
		}
	}

}
