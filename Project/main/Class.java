package main;

class Calculater {
    int num = 50;

    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
}

public class Class {
    public static void main(String[] args) {
       Calculater cls = new Calculater();

        int result = cls.add(5, 3); // calls add(int, int)
        System.out.println(result);

        double res = cls.add(5.0, 3); // calls add(double, int)
        System.out.println(res);

        System.out.println(cls.num);
    }
}
