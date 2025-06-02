public class removevowels {
    public static void main(String[] args) {
        String st = "youcandoit";
        removeVowels(st);
    }

    public static void removeVowels(String st) {

        for (int i = 0; i < st.length(); i++) {
            char a = st.charAt(i);
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                continue;
            }
            System.out.println(a);

        }
    }
}

