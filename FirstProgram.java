package MyProjecttt;

public class FirstProgram {

    public static void main(String[] args) {
        
        int num = 13, count = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {  
                count++;
            }
        }
        
        if (count == 2) {  
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " 3.");
        }
    }
}