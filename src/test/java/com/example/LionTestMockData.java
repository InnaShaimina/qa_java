package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
@RunWith(MockitoJUnitRunner.class)// подключили Mockito к тестовому классу
public class LionTestMockData {
    @Mock
    Feline feline;
    @Test
    public void getLionKittensNoArgumentsReturnCorrectValueCheck() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedKittensCount = 1;
        int actualKittensCount = lion.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
        System.out.println(actualKittensCount);
    }
    @Test
    public void getLionFoodReturnCorrectValueCheck() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
        Assert.assertEquals(expectedFood, actualFood);
        System.out.println(actualFood);
    }
}