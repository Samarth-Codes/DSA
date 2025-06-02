public class uppercasetolowercase {
    public static void main(String[] args) {
        String st = "wElcoMEtoScaLEr";
        Lowercase(st);
    }

    public static void Lowercase(String st) {
        char[] s = st.toCharArray();
        for (int i = 0; i < s.length; i++) {
            char ch = s[i];
            if (ch >= 'A' && ch <= 'Z') {
                char ansch = (char) (ch - 'A' + 'a');
              s[i]=ansch;
            }
        }

        for (char aa : s) {
            System.out.print(aa);
        }
    }

}
