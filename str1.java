import java.util.Scanner;

class str1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s="";
        for (int i = str.length()-1; i >=0; i--) {
            s=s+str.charAt(i);
        }
        if(s.equals(str))
        System.out.println("Pallindrome");
        else
        System.out.println("Not Pallindrome");
    }
}