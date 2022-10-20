import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.*;

public class UnexpectedMeeting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter segment number ");
        int N= Integer.parseInt(scanner.nextLine());
        System.out.println("Enter pillars ");
        String [] pillars=scanner.nextLine().split("\\s+");
        scanner.close();
        LinkedList<Integer>sumsLength=new LinkedList<>();
        int sum=0;
        for (int i = 0; i < pillars.length; i++) {
            sum=Integer.parseInt(pillars[i]);
            for (int j = i+1; j < pillars.length ; j++) {
                sum+=+Integer.parseInt(pillars[j]);
                sumsLength.add(sum);
            }
        }
        Comparator comparator=new Comparator();
        sumsLength.sort(comparator);
        System.out.println("The segment number "+N+" is "+sumsLength.get(N-1));
    }
}
