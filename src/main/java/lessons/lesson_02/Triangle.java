package lessons.lesson_02;

public class Triangle {
    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean checkA(){
        if (a*a == b*b+c*c)return true;
        return false;
    }
    private boolean checkB(){
        if (b*b == a*a+c*c)return true;
        return false;
    }
    private boolean checkC(){
        if (c*c == b*b+a*a)return true;
        return false;
    }
    public boolean isTriangle(){
        if(checkA() || checkB() || checkC()) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

}
