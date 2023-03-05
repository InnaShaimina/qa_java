package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private IFeline feline; //создали в зависимом классе поле того же типа что и интерфейс

    //создали конструктор с параметром того же типа что и интерфейс
    public Lion(IFeline feline, String sex) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
