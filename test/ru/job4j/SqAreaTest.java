package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void square() {
        double in = SqArea.square(6, 2);
        double expected = 4.0;
        double out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01);
    }

}
