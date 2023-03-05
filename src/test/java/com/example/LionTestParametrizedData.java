package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class) // запускаем тест с параметрами
public class LionTestParametrizedData {
    Feline feline;
    private final String sex;
    private final boolean expectedHasMane;
    public LionTestParametrizedData(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Покемон", false},
        };
    }

    @Test
    public void lionSexParametrizedCheck()  {
        try {
            Lion lion = new Lion(feline, sex);
            boolean actualHasMane = lion.doesHaveMane();
            Assert.assertEquals(expectedHasMane, actualHasMane);
            System.out.println(actualHasMane);
        } catch (Exception e) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}