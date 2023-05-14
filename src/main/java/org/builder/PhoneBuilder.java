package org.builder;

public class PhoneBuilder implements Builder {

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

    public Phone getResult() {
        return new Phone(cpuType, memorySize);
    }
}
