import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram_string {
    //What is anagram?
    // CARE & RACE are anagrams 

    public static void anagram_check(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] str1_arr = str1.toCharArray();
            char[] str2_arr = str2.toCharArray();
            
            Arrays.sort(str1_arr);
            Arrays.sort(str2_arr);

            if (Arrays.equals(str1_arr,str2_arr)) {
                System.out.println("anagram");
            }
            else{          
                System.out.println("not anagram");
            }
        }
        else{          
            System.out.println("not anagram");
        }
    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        anagram_check(str1, str2);
    }
}
