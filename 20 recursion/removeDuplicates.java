/**
 * removeDuplicates
 */
public class removeDuplicates {

    public static void rmvDup(String s,int n,StringBuilder sd,boolean map[]) {
        if (n==s.length()) {
            System.out.println(sd);
            return;
        }

        if (map[s.charAt(n)-'a']==false) {
            map[s.charAt(n)-'a'] = true;
            sd.append(s.charAt(n));
        }
        rmvDup(s, n+1, sd, map);
    }

    public static void main(String[] args) {
        rmvDup("apnacollege", 0,new StringBuilder(""),new boolean[26]);
    }
}