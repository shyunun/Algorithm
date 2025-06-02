import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int array[] = new int[10];
        int compare[] = new int[42];
        int count = 0, num = 0;
        
        Arrays.fill(compare, 0);
        
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            num = array[i] % 42;
            compare[num] = 1; 
        }

        for(int i = 0; i < compare.length; i++) {
            if(compare[i] != 0) count++;
        }
        System.out.println(count);
    }
}
