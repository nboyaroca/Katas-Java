package katas;

import java.util.List;

public class Calculator {
    private double total = 0.0;

    public double getTotal() {
        return this.total;

    }

    //Haz una función que sume un número con al total de la calculadora
    public void sum(double i) {
        this.total += i;
        //this.total = this.total + i;
    }

    //Haz una función que reste un número al total de la calculadora
    public void rest(double i) {
        this.total -= i;
    }

    //Haz una función que multiplique por un numero el total
    public void multi(double i) {
        this.total *= i;
    }

    public void multiTwoNum(double a, double b) {
        this.total = a * b;
    }

    //Haz una función que divida por un numero el total
    public void div(double i) {
        this.total /= i;
    }

    public void divTwoNum(double a, double b) {
        this.total = a / b;
    }

    //Haz una función que al pasarle un número calcule el % del total y lo modifique con el resultado
    public void percent(double i) {
        this.total = (this.total * 100) / 100;
    }

    //Haz una función que al pasarle un numero nos indique si es par
    public boolean even(double i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Haz una función que al pasarle dos números devuelva el mayor
    public void greater(double a, double b) {
        this.total = Math.max(a, b);
    }

    //Haz una función que al pasarle un array de números ponga el resultado de la suma de todos ellos en el total
    public void sumArray(double [] numArray) {
        double add = 0;
        for (int i = 0; i < numArray.length; i++) {
            add += numArray[ i ];

            this.total= add;
        }
    }

    //Haz una función que al pasarle una lista de enteros List<Integer> devuelva otra lista que tenga solamente los números mayores o iguales a 5
    public List<Integer> greaterOrEqualTo5(List<Integer> list) {

        List<Integer> greater5List = new java.util.ArrayList<>(List.of());

        for (int n : list) {
            if (n >= 5) {
                greater5List.add(n);
            }
        }
        return greater5List;
    }
}


