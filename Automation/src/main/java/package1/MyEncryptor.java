package package1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class MyEncryptor {
    private final List<String> alphabet = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

    private final Map<String, String> encryptionTable = new HashMap<>();
    private final Map<String, String> decryptionTable = new HashMap<>();
    private final int translationNumber;

    public MyEncryptor(int translationNumber) {
        this.translationNumber = translationNumber % alphabet.size();
        initTables();
    }

    private void initTables() {
        for (int i = 0; i < alphabet.size(); i++) {
            encryptionTable.put(alphabet.get(i), alphabet.get((i + translationNumber) % alphabet.size()));
            encryptionTable.put(" ", " ");
            decryptionTable.put(alphabet.get(i), alphabet.get((i + alphabet.size() - translationNumber) % alphabet.size()));
            decryptionTable.put(" ", " ");
        }
    }

    public String encrypt(String phrase) {
        StringBuilder str = new StringBuilder();
        String lowerPhrase = phrase.toLowerCase(Locale.ROOT);
        for (int i = 0; i < phrase.length(); i++) {
            str.append(encryptionTable.get(lowerPhrase.substring(i, i + 1)));
        }
        return str.toString();
    }

    public String decrypt(String phrase) {
        StringBuilder str = new StringBuilder();
        String lowerPhrase = phrase.toLowerCase(Locale.ROOT);
        for (int i = 0; i < phrase.length(); i++) {
            str.append(decryptionTable.get(lowerPhrase.substring(i, i + 1)));
        }
        return str.toString();
    }
}
