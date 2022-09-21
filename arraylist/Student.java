package oop.arraylist;

public class Student {
    private String id;
    private String name;
    private String nameClass;
    private double math;
    private double physics;
    private double chemistry;

    public Student() {

    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String name, String nameClass, double math, double physics, double chemistry) {
        this.id = id;
        this.name = name;
        this.nameClass = nameClass;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", class: " + nameClass + ", math: " + math
                + ", physic: " + physics + ", chemistry: " + chemistry;
    }
    public double sumScore() {
        return math + physics + chemistry;
    }
}
