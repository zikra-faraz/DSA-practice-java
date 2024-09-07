package strings;

public class removeConsecuttiveChar {
    static String  removeChar(String s){
        StringBuilder str = new StringBuilder();

     char prev =  s.charAt(0);
        str.append(prev);
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)!= prev){
                str.append(s.charAt(i));
            }
            prev = s.charAt(i);
        }
      return str.toString();
    }


    static  String optimizeRemoving(String s){
        int i = 0;
        int j = 0;
        String newStr = "";
        while (j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            } else if (s.charAt(i)!= s.charAt(j) || j==s.charAt(s.length()-1)) {
                newStr += s.charAt(i);
                i= j;
                j++;
            }

        }
        newStr += s.charAt(i);

        return newStr;
    }
    public static void main(String[] args) {
//        System.out.println(removeChar("aabbacccdd"));
        System.out.println(optimizeRemoving("aabbbccccccde"));
    }
}
