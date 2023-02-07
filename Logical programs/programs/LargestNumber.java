class LargestNumber {
    public static void main(String[] args) {
        int[] a = { 40, 10, 100,200 };
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        System.out.println("largest number in array=" + max);

    }
}