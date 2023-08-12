import java.util.*;
public class str2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.next(); 
        for(int i =0;i<s.length();i++)
        {
            String st="";
            for (int j = i; j < s.length(); j++) {
                st=st+s.charAt(j);
                System.out.println(st);
            }
        }
    }
}
