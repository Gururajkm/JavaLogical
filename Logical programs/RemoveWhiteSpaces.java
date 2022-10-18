class RemoveWhiteSpaces {
    public static void main(String[] args) {

        String str = "java  Programming oops";
        System.out.println(" before removing the white spaces:" + str);
        str = str.replaceAll("\\s", "");
        System.out.println("after removing the white spaces:" + str);

    }
}