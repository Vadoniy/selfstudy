package behavioral.templateMethod;

public class ConcreteClassA extends TemplateClass {
    @Override
    public void operation1() {
        System.out.println("ConcreteClassA.operation1");
    }

    @Override
    public void operation2() {
        System.out.println("ConcreteClassA.operation2");
    }
}
