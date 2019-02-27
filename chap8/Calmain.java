package chap8;

public class Calmain{       //인터페이스 응용

    public static void main(String[] args){
        Calinter calculator = new Calclass();
        int a,b,c,d;
        a=calculator.plus(5, 3);
        b=calculator.minus(5, 3);
        c=calculator.sum(5,3);
        System.out.print(a+b+c);
       // d=calculator.subtract(5, 3);
        //Calinter.subtract(5, 3);
    }
}

