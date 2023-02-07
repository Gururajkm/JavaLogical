class SmallestNumbers {
    public static void main(String[] args) {
        int[] s = { 10, 20, 5, 5, 40, 2 };
        int min = s[0];
        for (int i = 0; i < s.length; i++) {
            if (s[i] < min) {
                min = s[i];
            }

        }
        System.out.println(min + " is the smalest number in the array");

    }

}
