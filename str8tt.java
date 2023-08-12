import java.util.*;
public class str8tt {
    public static boolean isPallin(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            return false;
        
        i++;
        j--;
        }
        return true;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter String");
     String s=sc.nextLine();
     for (int i = 0; i < s.length(); i++) {
        for (int j = i+1; j < s.length(); j++) {
            String temp=s.substring(i, j);
            if(isPallin(temp))
            System.out.println(temp);
        }
     }
}
}
