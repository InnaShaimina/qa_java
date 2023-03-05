package com.example;

import java.util.List;

//создали интерфейс для класса-зависимости
public interface IFeline {
    public List<String> getFood(String animalKind) throws Exception;
    int getKittens();
    int getKittens(int kittensCount);
}
