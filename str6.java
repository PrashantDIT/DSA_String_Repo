import java.util.*;
public class str6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter string :");
        String s=sc.nextLine();
        StringBuffer sbf1 = new StringBuffer(" ");
        char currentChar = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char nextChar = s.charAt(i);
            if (currentChar == nextChar) {
                count++;
            } else {
                sbf1.append(currentChar);
                sbf1.append(count);
                currentChar = nextChar;
                count = 1;
            }
        }
        sbf1.append(currentChar);
        sbf1.append(count);
        System.out.println(sbf1);
    }
}