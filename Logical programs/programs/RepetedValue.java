class RepetedValue {
    public static void main(String[] args) {
        int i;
        // int count = 0, i;
        int[] a = { 10, 20, 30, 10, 50, 10 };
        for (i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[j]);
                }
            }

        }
    }
}