public class RepetedTen {

    public static void main(String[] args) {
        int count = 0;
        int i;
        int[] a = { 10, 20, 30, 10, 10, 60 };
        for (i = 0; i < a.length; i++) {
            if (a[i] == 10) {
                if (a[i] == 10)
                    count++;
            }
        }
        System.out.println(count);
    }
}
