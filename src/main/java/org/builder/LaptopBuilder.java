package org.builder;

public class LaptopBuilder implements Builder {

    private CpuType cpuType;
    private int memorySize;

    @Override
    public void setCpuType(CpuType cpuType) {
        this.cpuType = cpuType;
    }

    @Override
    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public Laptop getResult() {
        return new Laptop(cpuType, memorySize);
    }
}
