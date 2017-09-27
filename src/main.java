package src;

public class main {

    public Boolean findParentheses(String str) {
        int i = str.indexOf('(');
        int j = 0;
        while (str.indexOf('(', i) != -1) {
            if (str.indexOf(')', j) == -1) {
                return false;
            }
            j = str.indexOf(')', j);
            i = str.indexOf('(', i);
        }

        int k = str.indexOf('[');
        int l = 0;
        while (str.indexOf('[', k) != -1) {
            if (str.indexOf(']', l) == -1) {
                return false;
            }
            j = str.indexOf(']', k);
            i = str.indexOf('[', l);
        }

        int m = str.indexOf('{');
        int n = 0;
        while (str.indexOf('{', m) != -1) {
            if (str.indexOf('}', n) == -1) {
                return false;
            }
            j = str.indexOf('}', m);
            i = str.indexOf('{', n);
        }

        return true;

    }
}
