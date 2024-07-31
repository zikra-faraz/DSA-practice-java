package strings;

import java.util.Arrays;

public class stringBuilder {
    //separate class just like string
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
  char ch  = (char)('a'+i);
  builder.append(ch);
        }

        System.out.println(builder.toString());

        String name  ="hello world lets do coding";
        System.out.println(Arrays.toString(name.split(" ")));
    }


}
