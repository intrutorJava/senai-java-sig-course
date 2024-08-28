package lambdaExpressions;

import javax.swing.*;

public class Cat implements Printable{
    public String name;
    public int age;
    public Cat() {}

    @Override
    public String print(String suffix) {
        System.out.println("MEOW");
        return null;
    }
}
