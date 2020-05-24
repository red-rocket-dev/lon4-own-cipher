package pl.sda;

import java.util.Arrays;

public class Main {

    public static final char[] CIPHER_ARRAY = new char[123];

    static {
        CIPHER_ARRAY['a'] = 'l';
        CIPHER_ARRAY['s'] = 'k';
        CIPHER_ARRAY['d'] = 'j';
        CIPHER_ARRAY['f'] = 'h';
        CIPHER_ARRAY['g'] = 'g';
        CIPHER_ARRAY['q'] = 'p';
        CIPHER_ARRAY['w'] = 'o';
        CIPHER_ARRAY['e'] = 'i';
        CIPHER_ARRAY['r'] = 'u';
        CIPHER_ARRAY['t'] = 'y';
        CIPHER_ARRAY['z'] = 'm';
        CIPHER_ARRAY['x'] = 'n';
        CIPHER_ARRAY['c'] = 'b';
        CIPHER_ARRAY['v'] = 'v';
        CIPHER_ARRAY['1'] = '0';
        CIPHER_ARRAY['2'] = '9';
        CIPHER_ARRAY['3'] = '8';
        CIPHER_ARRAY['4'] = '7';
        CIPHER_ARRAY['5'] = '6';
        CIPHER_ARRAY['l'] = 'a';
        CIPHER_ARRAY['k'] = 's';
        CIPHER_ARRAY['j'] = 'd';
        CIPHER_ARRAY['h'] = 'f';
        CIPHER_ARRAY['p'] = 'q';
        CIPHER_ARRAY['o'] = 'w';
        CIPHER_ARRAY['i'] = 'e';
        CIPHER_ARRAY['u'] = 'r';
        CIPHER_ARRAY['y'] = 't';
        CIPHER_ARRAY['m'] = 'z';
        CIPHER_ARRAY['n'] = 'x';
        CIPHER_ARRAY['b'] = 'c';
        CIPHER_ARRAY['0'] = '1';
        CIPHER_ARRAY['9'] = '2';
        CIPHER_ARRAY['8'] = '3';
        CIPHER_ARRAY['7'] = '4';
        CIPHER_ARRAY['6'] = '5';
    }

    public static void main(String[] args) {
        System.out.println("Wejscie:");
        System.out.println(args[0]);
        System.out.println("Zaszyfrowany:");
        // Zaszyfruj hasło otrzymane w argumentach aplikacji (args) za pomocą następującego szyfru
        // polecenie do uruchomienia aplikacji java -cp app.jar your.main.Class argument1 argument2
        //TODO: intro do pobierania argumentow



        String wordToEncode = args[0];
        //na piechote wynik kodowania to - 0987654321
        StringBuilder encodedString = encode(wordToEncode);
        System.out.println(encodedString);
    }

    private static StringBuilder encode(String wordToEncode) {
        char[] charsToEncode = wordToEncode.toCharArray();
        StringBuilder encodedString = new StringBuilder();
        for(int i = 0; i < charsToEncode.length; i ++) {
            char characterToEncode = charsToEncode[i];
            encodedString.append(CIPHER_ARRAY[characterToEncode]);
        }
        return encodedString;
    }
}
