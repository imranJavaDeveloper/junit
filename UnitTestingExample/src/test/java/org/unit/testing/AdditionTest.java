package org.unit.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class AdditionTest {

    @Test
    public void add(){
        int result=Addition.add(45,36);
        int expected =81;

        Assertions.assertEquals(result,expected);
    }


}
