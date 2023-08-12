import java.util.Scanner;
public class str4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        s=s+" ";
        int len=s.length();
        String res="";
        for(int i=0;i<len-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                res=res+s.charAt(i);
            }
        }
        System.out.println("Result = "+res);
        sc.close();
    }    
}