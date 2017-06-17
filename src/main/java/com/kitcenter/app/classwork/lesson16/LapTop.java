package com.kitcenter.app.classwork.lesson16;

import java.util.Objects;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-17
 */
public class LapTop {
    private String name;
    private int cpu;
    private int ram;
    private String color;

    public LapTop(String name, int cpu, int ram) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public int getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        String lapTop = "Name: " + getName() + "\n"
                + "cpu: " + getCpu() +  "\n"
                + "ram: " + getRam() + "\n"
                + "color: " + getColor();
        return lapTop;
    }

//    @Override
//    public boolean equals(LapTop lapTop){
//        Boolean result = true;
//        result = this.name == lapTop.name;
//        result = this.cpu == lapTop.cpu;
//        result = this.ram == lapTop.ram;
//
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LapTop)) return false;

        LapTop lapTop = (LapTop) o;

        return getCpu() == lapTop.getCpu() &&
                getRam() == lapTop.getRam();
    }

//    @Override
//    public int hashCode() {
//        int result = getCpu();
//        result = 31 * result + getRam();
//        return result;
//    }

    @Override
    public int hashCode(){
        return Objects.hash(getCpu(),getRam());
    }

    public void upgrade(int cpu){
        setCpu(cpu);
        System.out.println("CPU is upgraded to " + cpu);
    }

    public void upgrade(int cpu, int ram){
        setCpu(cpu);
        setRam(ram);
        System.out.println("CPU is upgraded to " + cpu);
        System.out.println("RAM is upgraded to " + ram);
    }
}
