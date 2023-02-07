class OddNumber {
    public static void main(String[] args) {
        int[] a = { 2, 8, 7, 5, 9, 5 };
        int i;
        int len = a.length;
        for (i = 0; i < len; i++) {
            if (a[i] % 2 != 0) {
                System.out.println("The numbers in the array are: " + a[i]);
            }
        }
        // System.out.println("The numbers in the array are: " + a[i]);
    }

}
