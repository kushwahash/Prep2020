class Anagram {
    public static boolean anagramTest(String one, String two) { // two parameter and boolean (true or false)

        String a = one.toLowerCase(); // making value into lower case
        String b = two.toLowerCase();
        // if length of two strings not equal, they cannot be anagram
        if (a.length() != b.length()) {
            return false;
        }
        // length is equal

        int[] check = new int[50]; // new array called counter with 50 space
        int difference = 0; // new int labled checker

        for (int i = 0; i < a.length(); i++) { // for loop for first length
            int o = (int) a.charAt(i) - 97; // making char into array index, a numeric value for a?
            if (check[o] >= 0) { // ---
                difference++;
            } else {
                difference--; // ---
            }
            check[o]++; // ----

            int t = (int) b.charAt(i) - 97; // making char into array index
            if (check[t] <= 0) {
                difference++;
            } else {
                difference--;
            }
            check[t]--;
        }
        return difference == 0; // return checker with value of 0
    }

    public static void main(String[] args) {
        System.out.println(anagramTest("ABCDEFGHIJKLMNOPQRSTUWXYZABCDEFGHIJKLMNOPQRSTUWXYZ",
                "ABCDEFGHIJKLMNOPQRSTUWXYZABCDEFGHIJKLMNOPQRSTUWXYZ"));
    }
}
