import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass myClass=new MyClass("Samira","Nurmat kyzy",18,new String[]{"Java","English","js"},"manty");
        System.out.println(myClass.getName()+"  "+myClass.getSurName()+"  "+myClass.getAge()+" "+ Arrays.toString(myClass.getCourses())+myClass.getDishes());
        MyClass myClass1=new MyClass("Saikal","Murativa ",18, new String[]{"Java","English","js",},"lagman");
        System.out.println(myClass1.getName()+" "+myClass1.getSurName()+" "+myClass1.getAge()+" "+Arrays.toString(myClass1.getCourses())+" "+myClass1.getDishes());

    }
}