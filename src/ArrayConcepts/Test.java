package ArrayConcepts;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"Avinash", "Jatin", "Guru", "Kapil", "Tejal", "Karan", "Rhythm"};


//		Guru, Jatin
//
//		{7,5,4,5,5,5,6}

//		int[] arr=new int[words.length];
//		int count;
		
		for(int i=0;i<words.length-1;i++){
			for(int j=i+1;j<words.length;j++){
				if(words[i].length()>words[j].length()){
					String temp="";
					temp=words[i];
					words[i]=words[j];
					words[j]=temp;
				}
		}

		}
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}


			

	}

}
