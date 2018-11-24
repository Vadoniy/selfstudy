package behavioral.templateMethod;

public abstract class TemplateClass {

    public void templateMethod(){
        System.out.println("Template part0");
        System.out.println("Template part1");
        System.out.println("Template part2");
        operation1();
        System.out.println("Template part3");
        System.out.println("Template part4");
        operation2();
        System.out.println("Template part5");
        System.out.println("Template part6");
    }

    public abstract void operation1();
    public abstract void operation2();
}
