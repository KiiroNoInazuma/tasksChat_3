public class Number_8 {
    static String rubbish = "aabccddefgghiijjkk";

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        char begin = rubbish.charAt(0);
        for (int i = 1; i < rubbish.length(); i++) {
            if (begin == rubbish.charAt(i)) {
                str.append(begin);
                continue;
            }
            begin = rubbish.charAt(i);
        }
        System.out.println(str);
    }
}
