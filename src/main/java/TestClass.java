/**
 * Created by MyBitch on 4/21/2015.
 */
public class TestClass {
	public static String inverse(String str){
		String result = "";
		for(int i=0; i<str.length();i++){
			result+=str.charAt(str.length()-1-i);
		}
		return result;
	}
}
