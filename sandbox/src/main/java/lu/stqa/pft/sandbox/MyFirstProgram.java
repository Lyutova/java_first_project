package lu.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello(" Yulia");

        double l =5;
        System.out.println("Площаль квадрата " + l + " = " + area(l));

        double t=2;
        double r=3;
        System.out.println("Площаль прямоуголька со сторанами  " + t + " и " + r + " = " + area(t,r));
    }
    public static void hello (String somebody){
        System.out.println("Hello,"+ somebody +"!");
    }
    public static double area(double len) {
        return len*len;
    }
    public static double area(double a,double b) {
        return a*b;
    }

}

