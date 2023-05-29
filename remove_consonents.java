
public class remove_consonents {

    public String removeConsonants(String s)
   {
		StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                sb.append(ch);
            }
        }
        if(sb.length() == 0)
          return "No Vowel";
    return sb.toString();
    }
    static boolean isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
