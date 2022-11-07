public class MyClass {
    private String name;
    private String surName;
    private int age;
    private String []courses;
    private String dishes;
    public MyClass(String name,String surName,int age,String[]courses,String dishes){
        this.name=name;
        this.surName=surName;
        this.age=age;
        this.courses=courses;
        this.dishes=dishes;
    }
    public MyClass(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDishes() {
        return dishes;
    }

    public void setDishes(String dishes) {
        this.dishes = dishes;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
