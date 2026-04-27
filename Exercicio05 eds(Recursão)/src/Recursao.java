public class Recursao {

    // 1. Inversão de String
    public static String inverter(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return inverter(s.substring(1)) + s.charAt(0);
    }

    // 2. Verificação de palíndromo
    public static boolean palindromo(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return palindromo(s.substring(1, s.length() - 1));
    }

    // 3. Soma dos elementos de um array
    public static int somaArray(int[] arr, int indice) {
        if (indice == arr.length) {
            return 0;
        }
        return arr[indice] + somaArray(arr, indice + 1);
    }

    // 4. Maior elemento de um array
    public static int maiorElemento(int[] arr, int indice) {
        if (indice == arr.length - 1) {
            return arr[indice];
        }
        int maiorDoResto = maiorElemento(arr, indice + 1);
        return arr[indice] > maiorDoResto ? arr[indice] : maiorDoResto;
    }

    // 5. Contagem de dígitos
    public static int contarDigitos(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + contarDigitos(n / 10);
    }

}
