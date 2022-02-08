package com.company;

import java.util.Objects;

public class Employee {
    private String name;
    private int otdel;
    private float zp;
    private int id;
    static int counter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", otdel=" + otdel +
                ", zp=" + zp +
                '}';
    }

    public int getOtdel() {
        return otdel;
    }

    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public float getZp() {
        return zp;
    }

    public void setZp(float zp) {
        this.zp = zp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return otdel == employee.otdel && Float.compare(employee.zp, zp) == 0 && id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, otdel, zp, id);
    }

    public static int getCounter() {
        return counter;
    }

    public Employee(String name, int otdel, float zp) {
        this.name = name;
        this.otdel = otdel;
        this.zp = zp;
        counter = counter + 1;
        this.id = counter;
    }
}//

