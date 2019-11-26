import java.util.regex.Pattern;

public class validemailId_in_string {
	/*static boolean checkemail(String email) {
	      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      return email.matches(regex);
	   }

	public static void main(String[] args){
		String email=new String();
		email="hi welcome to @schwab.com your new mail is test@sc and test@sc.com";
		//char ch[]=email.toCharArray();
		//System.out.println(ch);
		System.out.println("The email id is"+checkemail(email));
		
	}
	*/
	
	 public static boolean isValid(CharSequence ch) 
	    { 
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
	                            "[a-zA-Z0-9_+&*-]+)*@" + 
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
	                            "A-Z]{2,7}$"; 
	                              
	        Pattern pat = Pattern.compile(emailRegex); 
	        if (ch == null) 
	            return false; 
	        return pat.matcher(ch).matches(); 
	    } 
	  
	    /* driver function to check */
	    public static void main(String[] args) 
	    { 
	        String email = "hi welcome to @schwab.com your new mail is test@sc and test@sc.com";
	       char[] ch=email.toCharArray();
	       for(char output: ch){
	    	   System.out.println(output);
	       }
	        
	      if (isValid(ch)) 
	            System.out.print("Email id is valid"); 
	        else
	            System.out.print("Email id is invalid"); 
	          
	    } 
}
