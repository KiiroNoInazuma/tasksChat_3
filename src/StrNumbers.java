
public class StrNumbers {
    String one = "135";
    String two = "246";
    String result;

    public static void main(String[] args) {
        StrNumbers str = new StrNumbers();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.one.length(); i++) {
            sb.append(str.one.charAt(i));
            sb.append(str.two.charAt(i));
        }
        str.result = String.valueOf(sb);
        System.out.println(str.result);
    }

}
