public class App {
    public static void main(String[] args) throws Exception {
        MorseTranslator translator = new MorseTranslator();
        System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
    }
}
