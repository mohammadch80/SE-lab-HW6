package org.builder;

public class Laptop {
    private final CpuType cpuType;
    private final int memorySize;

    public int getMemorySize() {
        return memorySize;
    }

    public CpuType getCpuType() {
        return cpuType;
    }

    public Laptop(CpuType cpuType, int memorySize) {
        this.cpuType = cpuType;
        this.memorySize = memorySize;
    }
}
