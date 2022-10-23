package lu.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello(" Yulia");

        Square s = new Square(3);
        System.out.println("Площаль квадрата " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(1,4);
        System.out.println("Площаль прямоуголька со сторанами  " + r.a + " и " + r.b + " = " + r.area());
    }
    public static void hello (String somebody){
        System.out.println("Hello,"+ somebody +"!");
    }
}

