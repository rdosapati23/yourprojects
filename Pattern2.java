package MyProjecttt;

public class Pattern2 {
    public static void main(String[] args) {
        int sp = 10;
        
        for (int r = 1; r  <=12 ; r++) {
          
            for (int k = 1; k <= sp; k++) {
                System.out.print(" ");             }
            sp = sp - 1;
            for (int c = 1; c <= r; c++) {
                System.out.print(r+" ");
            }
           
            System.out.println();
        }
    }
}