import java.util.stream.*;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class MorseTranslator {

    private final Map<String,String> morseMap;
    
    public MorseTranslator()
    {
        morseMap = new HashMap<>();

        morseMap.put(".-", "a");
        morseMap.put("-...", "b");
        morseMap.put("-.-.", "c");
        morseMap.put("-..", "d");
        morseMap.put(".", "e");

        morseMap.put("..-.", "f");
        morseMap.put("--.", "g");
        morseMap.put("....", "h");
        morseMap.put("..", "i");
        morseMap.put(".---", "j");

        morseMap.put("-.-", "k");
        morseMap.put(".-..", "l");
        morseMap.put("--", "m");
        morseMap.put("-.", "n");
        morseMap.put("---", "o");

        morseMap.put(".--.", "p");
        morseMap.put("--.-", "q");
        morseMap.put(".-.", "r");
        morseMap.put("...", "s");
        morseMap.put("-", "t");

        morseMap.put("..-", "u");
        morseMap.put("...-", "v");
        morseMap.put(".--", "w");
        morseMap.put("-..-", "x");
        morseMap.put("-.--", "y");

        morseMap.put("--..", "z");
        morseMap.put("/", " ");


        morseMap.put(".----", "1");
        morseMap.put("..---", "2");
        morseMap.put("...--", "3");
        morseMap.put("....-", "4");
        morseMap.put(".....", "5");
        morseMap.put("-....", "6");
        morseMap.put("--...", "7");
        morseMap.put("---..", "8");
        morseMap.put("----.", "9");
        morseMap.put("-----", "0");

    }


    public String translate(String string) {
        return Arrays
            .stream(string.split(" "))
            .map(n -> morseMap.get(n))
            .collect(Collectors.joining(""));
    }

}
