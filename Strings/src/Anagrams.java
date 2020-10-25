
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="cat";
		String b="act";
		boolean isAnagram=false;
		boolean visited[]=new boolean[b.length()];
		
		if(a.length()==b.length()) {
			for(int i=0;i<a.length();i++) {
				char c=a.charAt(i);
				isAnagram=false;
				for(int j=0;j<b.length();j++) {
					if(b.charAt(j)==c && !visited[j]) {
						isAnagram=true;
						visited[j]=true;
						break;
						
					}
					
				}
				if(!isAnagram) {
					break;
				}
		}if(isAnagram) {
			System.out.println("Anagram");
		}else {
			System.out.println("not Anagram");
		}
	}

 }
}
