public class restoreString {

    public static String ShuffleString(String s, int[] indices) {

        // Create a character array to store the rearranged string
        char[] result = new char[s.length()];

        // Place each character at its correct index
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }

        // Convert char array back to String
        return new String(result);
        //We can also use string.valueOf(result) to convert char array to string
    }

    public static void main(String[] args) {

        String s = "code";

        int[] indices = {3, 1, 2, 0};

        String answer = ShuffleString(s, indices);

        System.out.println("Restored String: " + answer);
    }
}