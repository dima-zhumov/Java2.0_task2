package ru.appline;

import org.junit.Assert;
import org.junit.Test;
import ru.appline.part3.calculator.Calculator;
import ru.appline.part3.calculator.operations.Addition;
import ru.appline.part3.calculator.operations.Division;
import ru.appline.part3.calculator.operations.Multiplication;
import ru.appline.part3.calculator.operations.Subtraction;

public class CalculatorTests {

    @Test
    public void checkCurrentValueFromStart(){
        Calculator calculator = new Calculator();
        Assert.assertNull("Начальное значение не пусто", calculator.getCurrentStorage());
    }

    @Test
    public void checkRepeatChangeCurrentValue(){
        Calculator calculator = new Calculator();
        calculator.setCurrentStorage(2.0);
        calculator.setCurrentStorage(4.0);
        Assert.assertNotEquals("Повторное изменение текущего значения не прошло", 2.0, calculator.getCurrentStorage());
        Assert.assertEquals("Текущее значение не меняется",4.0, calculator.getCurrentStorage(), 0.0);
    }

    @Test
    public void checkAddition(){
        Addition addition =  new Addition();
        Assert.assertEquals("Сложение не работает", 28, addition.addition(13.0, 15.0), 0.0);
    }

    @Test
    public void checkSubtraction(){
        Subtraction subtraction =  new Subtraction();
        Assert.assertEquals("Вычитание не работает", 7, subtraction.subtraction(15.0, 8.0), 0.0);
    }

    @Test
    public void checkMultiplication(){
        Multiplication multiplication =  new Multiplication();
        Assert.assertEquals("Сложение не работает", 9, multiplication.multiplication(3.0, 3.0), 0.0);
    }

    @Test
    public void checkDivision(){
        Division division =  new Division();
        Assert.assertEquals("Сложение не работает", 5, division.division(10.0, 2.0), 0.0);
    }
}
