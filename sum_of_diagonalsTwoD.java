public class sum_of_diagonalsTwoD {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};

        int pd = 0;
        int sd = 0;
        int i = 0;
        int j = 0;
        int sde = a.length-1;
        int pde = a.length;

        while (i<pde) {
            pd = pd + a[i][i];
            i++;

            sd = sd + a[j][sde];
            j++;
            sde--;
        }
        System.out.println("Sum of primary diagonal  = " + pd);
        System.out.println("Sum of secondary diagonal  = " +sd);
        System.out.println("Total = "+ (pd+sd));
    }
}
