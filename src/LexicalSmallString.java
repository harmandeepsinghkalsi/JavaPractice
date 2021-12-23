package practice;

// You can swap adjacent a and b , b and c but not a and c, to make the lexically small string which means
//s.charAt(j)<s.charAt(i)
public class LexicalSmallString {

    public static void main(String[] args) {

        String s = "abaacbac";
        System.out.println(smallestString(s));
    }

    public static String smallestString(String s){

        char[] ch = s.toCharArray();
        for (int i = 0,j=i+1; i < s.length()-1; i++,j++) {

            if(ch[j] < ch[i] ){
                if(ch[j]=='a' && ch[i]=='c'){
                    continue;
                }
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j]= temp;
            }
        }

        return String.valueOf(ch);
    }
}
