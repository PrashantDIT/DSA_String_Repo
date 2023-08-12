import java.util.Scanner;

public class str7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        char c = sc.next().charAt(0);  
        String w="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==c)
            {
                continue;
            }
            else
            {
                w=w+s.charAt(i);
            }
        }
        System.out.println("String is : "+w);
    }
}
