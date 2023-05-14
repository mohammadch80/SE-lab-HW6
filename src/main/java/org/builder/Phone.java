package org.builder;

public class Phone {
    private final CpuType cpuType;
    private final int memorySize;

    public int getMemorySize() {
        return memorySize;
    }

    public CpuType getCpuType() {
        return cpuType;
    }

    public Phone(CpuType cpuType, int memorySize) {
        this.cpuType = cpuType;
        this.memorySize = memorySize;
    }
}
