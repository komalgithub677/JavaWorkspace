package string;

public class CountDigitsAlphabetsSpecialCharacters {

    public void characterDigitAlphabetSpecial(String s) {

        int countDigit = 0;
        int countAlphabet = 0;
        int countSpecial = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                countDigit++;
            }
            else if ((ch >= 'A' && ch <= 'Z') || 
                     (ch >= 'a' && ch <= 'z')) {
                countAlphabet++;
            }
            else {
                countSpecial++;
            }
        }

        System.out.println("Digits: " + countDigit);
        System.out.println("Alphabets: " + countAlphabet);
        System.out.println("Special Characters: " + countSpecial);
    }

    public static void main(String[] args) {
        CountDigitsAlphabetsSpecialCharacters obj =
                new CountDigitsAlphabetsSpecialCharacters();

        obj.characterDigitAlphabetSpecial("Hello@123!");
    }
}
