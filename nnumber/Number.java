import java.util.*;

public class Number {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in); 
        System.out.println("Enter the number");
        int n = inp.nextInt();
        int i = 0;
        while (i < n) {
            i = i + 1;
            System.out.println(i);
        }
    }
}
