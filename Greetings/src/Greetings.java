public class Greetings
{
    public static void main (String[] args)
    {
        boolean isNiceWeather = true;
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }
        System.out.println("Hello World! wurde 10-mal ausgegeben!");

        if (isNiceWeather) {
            System.out.println("Super, es ist schönes Wetter!");
        }
    }
}
