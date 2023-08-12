import java.util.Scanner;

public class str3 {
    public String rev(String s) {
        String w = "";
        for (int i = s.length() -1 ; i >=0; i--) {
            w = w + s.charAt(i);
        }
        return w;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str3 ob = new str3();
        System.out.println("Enter String");
        String str = sc.nextLine();
        int p = 0;
        String r = "";
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                String w = str.substring(p, i);
                r = r + ob.rev(w);
                if (i != str.length()) {
                    r = r + " ";
                }
                p = i + 1;
            }
        }
        System.out.println("Reversed string: " + r);
    }
}
