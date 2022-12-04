public class spiral_matrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};

        int rs = 0;
        int cs = 0;
        int re = a.length-1;//4
        int ce = a[0].length-1;//4
        // System.out.println(re);
        // System.out.println(ce);

        while (rs<=re && cs<=ce) {
            for (int j = cs; j <= ce; j++) {
                System.out.println(a[rs][j]);
            }
            for (int k = rs+1; k <= re; k++) {
                System.out.println(a[k][ce]);
            }
            for (int j = ce-1; j >=cs; j--) {
                if (rs == re) {
                    break;
                }
                System.out.println(a[re][j]);
            }
            for (int k = re-1; k >rs ; k--) {
                if (cs == ce) {
                    break;
                }
                System.out.println(a[k][cs]);
            }
            rs++;
            cs++;
            re--;
            ce--;
        } 
    }
}
