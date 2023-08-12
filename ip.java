class ip {
    public String defangIPaddr(String address) {
        StringBuilder w = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                w.append("[.]");
            } else {
                w.append(c);
            }
        }
        return w.toString();
    }

    public static void main(String[] args) {
        ip ob = new ip();
        String s = "1.1.1.1";
        String res = ob.defangIPaddr(s);
        System.out.println("Result is: " + res);
    }
}
