package InterviewQuestions;

public class FindDuplicateCharactersInStringWithoutSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="amritanshmrikk";
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==(s.charAt(j))) {
					System.out.print(s.charAt(i));
					break;
				}
					
			}
		}

	}

}