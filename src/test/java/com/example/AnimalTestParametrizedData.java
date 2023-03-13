package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;
@RunWith(Parameterized.class) // запускаем тест с параметрами
public class AnimalTestParametrizedData {
    private final String animalKind;
    private final List<String> foodType;
    public AnimalTestParametrizedData(String animalKind, List<String> foodType) {
        this.animalKind = animalKind;
        this.foodType = foodType;
    }
    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }
    @Test
    public void getFoodParametrizedDataCheck() throws Exception {
        Animal animal = new Animal();
        List<String> expectedFood = foodType;
        List<String> actualFood = animal.getFood(animalKind);
        Assert.assertEquals(expectedFood, actualFood);
        System.out.println(actualFood);
    }
    @Test
    public void getFoodExceptionCheck(){
        String exceptionText = new String();
        try {
            Animal animal = new Animal();
            animal.getFood("Пивозавр");
        } catch (Exception e) {
            exceptionText = e.getMessage();
        }
        Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exceptionText);
        System.out.println(exceptionText);
    }

    @Test
    public void getFamilyCheck() {
        Animal animal = new Animal();
        String actualFamily = animal.getFamily();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", actualFamily);
        System.out.println(actualFamily);
    }
}