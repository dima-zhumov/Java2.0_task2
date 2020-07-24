package ru.appline.part2.randomarray;

public class RandomArray {
    public void startRandomArray() {
        int[] arrayNumbers = createRandomArray(20);
        int minNumber = 0;
        int min = 0;
        int maxNumber = 0;
        int max = 0;
        for (int i = 0; i < 20; i++) {
            if (arrayNumbers[i] < 0 && (minNumber == 0 || minNumber < arrayNumbers[i])) {
                minNumber = arrayNumbers[i];
                min = i;
            }
            if (arrayNumbers[i] > 0 && (maxNumber == 0 || maxNumber > arrayNumbers[i])) {
                maxNumber = arrayNumbers[i];
                max = i;
            }
        }

        if (minNumber != 0)
            System.out.println("Максимальный отрицательный элемент: " + minNumber);
        else
            System.out.println("Максимальный отрицательный элемент отсутствует");

        if (maxNumber != 0)
            System.out.println("Минимальный положительный элемент: " + maxNumber);
        else
            System.out.println("Минимальный положительный элемент отсутствует");

        if (minNumber < 0 && maxNumber > 0) {
            int number = minNumber;
            arrayNumbers[min] = arrayNumbers[max];
            arrayNumbers[max] = number;
            System.out.print("Измененный массив: { ");
            for (int item : arrayNumbers) {
                System.out.print(item + "; ");
            }
            System.out.println("}");
        }
    }

    public int[] createRandomArray(int size) {
        int[] arrayNumbers = new int[size];
        System.out.print("Элементы массива: { ");
        for (int i = 0; i < size; i++) {
            arrayNumbers[i] = -10 + (int) (Math.random() * 20);
            System.out.print(arrayNumbers[i] + "; ");
        }
        System.out.println("}");
        return arrayNumbers;
    }
}
