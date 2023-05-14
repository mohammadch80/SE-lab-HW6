package org.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuilderTest {

    @Test
    public void testPhoneBuilder() {
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        Director director = new Director();
        director.constructPhone(phoneBuilder);
        Phone phone = phoneBuilder.getResult();
        assertEquals(4, phone.getMemorySize());
        assertEquals(CpuType.Intel, phone.getCpuType());
    }

    @Test
    public void testLaptopBuilder() {
        LaptopBuilder laptopBuilder = new LaptopBuilder();
        Director director = new Director();
        director.constructLaptop(laptopBuilder);
        Laptop laptop = laptopBuilder.getResult();
        assertEquals(16, laptop.getMemorySize());
        assertEquals(CpuType.AppleSilicon, laptop.getCpuType());
    }
}
