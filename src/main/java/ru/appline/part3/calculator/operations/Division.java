package ru.appline.part3.calculator.operations;

public class Division {
    public Double division (Double numberFirst, Double numberSecond) {
        if (numberSecond==0){
            System.out.println("Can't be divisible by 0");
            throw new ArithmeticException();
        }
        return numberFirst / numberSecond;
    }
}
