package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    @Test
    public void eatMeatFelineReturnCorrectValuesCheck() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        Assert.assertEquals(expectedFood, actualFood);
        System.out.println(actualFood);
    }
    @Test
    public void getFamilyFelineReturnCorrectFamilyCheck() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
        System.out.println(actualFamily);
    }
    @Test
    public void getKittensFelineNoArgumentsReturnCorrectValueCheck() {
        Feline feline = new Feline();
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
        System.out.println(actualKittensCount);
    }
    @Test
    public void getKittensFelineWithArgumentsReturnCorrectValueCheck() {
        Feline feline = new Feline();
        int expectedKittensCount = 2;
        int actualKittensCount = feline.getKittens(2);
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
        System.out.println(actualKittensCount);
    }
}