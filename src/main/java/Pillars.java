import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pillars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter pillars ");
        String [] pillars=scanner.nextLine().split("\\s+");
        System.out.println(Arrays.toString(pillars));
        scanner.close();
        int count=0;
        for (int i = 0; i < pillars.length; i++) {
            for (int j = i+1; j < pillars.length ; j++) {
                if ( !(pillars[i].equals(pillars[j])) ){
                    count++;
                }
            }
        }
        System.out.println("Number of beautiful pillars is "+count);
    }
}
