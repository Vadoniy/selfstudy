package behavioral.templateMethod;

public class TemplateMethodMain {

    public static void main(String[] args) {
        ConcreteClassA a = new ConcreteClassA();
        ConcreteClassB b = new ConcreteClassB();

        a.templateMethod();
        System.out.println();
        b.templateMethod();
    }
}
