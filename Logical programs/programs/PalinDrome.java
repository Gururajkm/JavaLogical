class PalinDrome {
    public static void main(String[] args) {
        String s = "MADAM";
        String rev = " ";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        if (s.equals(rev)) {
            System.out.println("The given string is Palindrome");
        } else {
            System.out.println("The given String is not Palindrome");
        }

    }

}
