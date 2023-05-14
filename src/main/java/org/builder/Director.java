package org.builder;

public class Director {
    public void constructLaptop(Builder builder) {
        builder.setCpuType(CpuType.AppleSilicon);
        builder.setMemorySize(16);
    }

    public void constructPhone(Builder builder) {
        builder.setCpuType(CpuType.Intel);
        builder.setMemorySize(4);
    }
}
