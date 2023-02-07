class VowelCount {

    public static void main(String[] args) {
        String s = "Parashuram";
        int count = 0;
        s = s.toLowerCase();
        for (int i = 1; i <= s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
                // System.out.println("Number of Voweles Present in " + count);
            }
        }
        System.out.println("Number of Voweles Present in " + count);

    }
}
