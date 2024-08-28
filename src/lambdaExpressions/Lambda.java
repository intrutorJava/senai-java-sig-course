package lambdaExpressions;

public class Lambda {
    public static void main (String[] args){
        Printable lambdaPrintable = (s) -> {
            System.out.println("MEOW " + s);
            return "MEOW";
        };
    }

    static void printThing (Printable thing){
        thing.print("!");
    }
}
