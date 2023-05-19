
public class CaseConverter {
    public static void main(String[] args) {
        String input = "Hello World";
        String converted = convertCase(input);
        System.out.println(converted);
    }

    public static String convertCase(String input) {
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }

        return new String(chars);
    }
}