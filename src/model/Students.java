package model;

public class Students {
    public Students(String name, int age, int standard) {
        this.name = name;
        this.age = age;
        this.standard= standard;
    }

    String name;
    int age;

    int standard;

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void details(){
        System.out.println("Name        Class      Age");
        System.out.println(this.name+"       "+this.standard+"       "+this.age);
    }
}
