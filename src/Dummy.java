import java.util.ArrayList;

public class Dummy {
	
	    public static void main(String[] args) {
	    	int n=100;
	        System.out.println(alpha(n));


	    }
	    
	    public static String alpha(int i)
	    {
	      int w=i/26;
	      int r=i%26;
	      char letter =(char) ((int)'A'+r);
	      if(w==0)
	      {
	        ;
	        return ""+letter;
	      }
	      else
	      {
	        return alpha(w-1) +letter;
	      }
	    }


	
}
