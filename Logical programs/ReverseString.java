public class ReverseString {
    public static void main(String[] args) {

        String str = "GYKM";
        String rev = " ";
        /*
         * // Logic 1 - using +(String Concatenation) Operator
         * int len = str.length(); // 4
         * for (int i = len - 1; i >= 0; i--) // 3 2 1 0 -1
         * {
         * rev = rev + str.charAt(i); // DCBA
         * System.out.println("Reversed String: " + rev);
         * }
         * System.out.println("-----------------------");
         * System.out.println("Reversed String: " + rev);
         */

        /*
         * // logic-2 using character array
         * char a[] = str.toCharArray();
         * int len = a.length;
         * for (int i = len - 1; i >= 0; i--) {
         * rev = rev + a[i];
         * 
         * }
         * System.out.println("reversed string is: " + rev);
         */

        // logic-3 using string bufferclass
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

    }

}
