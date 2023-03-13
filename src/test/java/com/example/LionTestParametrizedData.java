package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class) // запускаем тест с параметрами
public class LionTestParametrizedData {
    Feline feline = new Feline();
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
        };
    }

    @Test
    public void lionSexParametrizedCheck() throws Exception {
        Lion lion = new Lion(feline, sex);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(expectedHasMane, actualHasMane);
        System.out.println(actualHasMane);
    }
}