import java.util.*;
public class str5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        int count=0;
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j))
                count++;
            }
        }
        System.out.println("Count is "+count);
    }
}
