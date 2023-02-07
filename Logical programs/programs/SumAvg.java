class SumAvg {
    public static void main(String[] args) {
        double[] n = { 1, 2, 3, 4, 5, 6, 7, 2.5 };
        double sum = 0;
        double avg = 1;
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
            avg = sum / n.length;
        }
        System.out.println(sum);
        System.out.println(avg);
    }

}
