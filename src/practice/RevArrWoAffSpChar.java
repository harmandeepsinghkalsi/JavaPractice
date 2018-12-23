package practice;

public class RevArrWoAffSpChar {
	
	public static void main (String args[]){
		String s= "a!!!b.c.d,e'f,ghi";
		char ch[]=s.toCharArray();
		String ans =reverse(ch);
		System.out.println(ans); // ans=i!!!h.g.f,e'd,cba
	}

	public static String reverse(char[] s) {
		// TODO Auto-generated method stub
		
		int left=0,right=s.length-1;
		while(left<right){
			if(isChar(s[left])&& !isChar(s[right])){
				right--;
			}
			else if (!isChar(s[left])&& isChar(s[right]))
			{
				left++;
			}
			else if(!isChar(s[left])&& !isChar(s[right])){
				right--;
				left++;
			}
			else{
				
				char leftCh=s[left];
				char rightCh=s[right];
				char temp=leftCh;
				s[left]=rightCh;
				s[right]=temp;
				right--;
				left++;
				
			}
		}
		String res=new String(s);
		return res;
	}
	
	
	public static boolean isChar(char ch){
		if (ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')
		return true;
		else
			return false;
	}
}
