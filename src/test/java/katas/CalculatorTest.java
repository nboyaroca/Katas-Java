package katas;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    public void calculatorStartsZero() {
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        var result = calculator.getTotal();
        //THEN
        assertEquals(0.0, result);
    }

    @Test
    public void calculatorSum() {
        Calculator calculator = new Calculator();

        calculator.sum(2);
        assertEquals(2, calculator.getTotal());

        calculator.sum(3);
        assertEquals(5, calculator.getTotal());
    }

    @Test
    public void calculatorRest() {
        Calculator calculator = new Calculator();

        calculator.rest(1);
        assertEquals(-1, calculator.getTotal());

        calculator.rest(-3);
        assertEquals(2, calculator.getTotal());
    }

    @Test
    public void calculatorMulti() {
        Calculator calculator = new Calculator();

        calculator.multi(4);
        assertEquals(0, calculator.getTotal());
    }

    @Test
    public void multiTwoNum() {
        Calculator calculator = new Calculator();

        calculator.multiTwoNum(2, 4);
        assertEquals(8, calculator.getTotal());
    }

    @Test
    public void calculatorDiv() {
        Calculator calculator = new Calculator();

        calculator.div(5);
        assertEquals(0, calculator.getTotal());

        //calculator.div(5);
        //assertEquals(2, calculator.getTotal(dobule 10));
    }

    @Test
    public void divTwoNum() {
        Calculator calculator = new Calculator();

        calculator.divTwoNum(10, 2);
        assertEquals(5, calculator.getTotal());
    }

    @Test
    public void calculatorPercent() {
        Calculator calculator = new Calculator();

        calculator.percent(20);
        assertEquals(0, calculator.getTotal());
    }

    @Test
    public void calculatorEven() {
        Calculator calculator = new Calculator();

        boolean result = calculator.even(2);
        assertEquals(true, result);
    }

    @Test
    public void calculatorGreater() {
        Calculator calculator = new Calculator();

        calculator.greater(2,5);
        assertEquals(5, calculator.getTotal());
    }

    @Test
    public void sumArray() {
        Calculator calculator = new Calculator();

        double [] arr = new double [] {2.0, 5.0, 10.0};
        calculator.sumArray(arr);
        var result = calculator.getTotal();
        assertEquals(17.0, result);
    }

    @Test
    public void greaterOrEqualTo5() {
        Calculator calculator = new Calculator();

        List<Integer> list = List.of(2, 5, 25, 17, 1); //creem la llista original

        List<Integer> grater5list = List.of(5, 25, 17); //creem la llista amb el resultat que necessitem

        List<Integer> result = calculator.greaterOrEqualTo5(list);
        System.out.println(result);

        assertEquals(grater5list, result);
    }
}


