package variables.src;

public class variables2 {
    public static void main(String[] args) throws Exception {
    String name = "Alany";
    int age = 19;
    String city = "Goiânia";
    float weigh = 53.8f;

    System.out.println ("i'm " + name + " my age is " + age + " i live in " + city + " and i weight  " + weigh + " kilograms ");
    
    //System.out.format("i'm  %s my age is %d, i live in %s and i weigth %.2f kilogrmas\n",name,age,city,weigh);

    //String text="i'm " + name + " my age is " + age + " i live in " + city + " and i weight  " + weigh + " kilograms ";
    
    //System.out.println(text);

    //String text2= String.format("i'm  %s my age is %d, i live in %s and i weigth %.2f kilogrmas\n",name,age,city,weigh);

    //System.out.println(text2);

    String materia1= "Programming Languages ​​and Paradigms\n";
    String materia2= "Object oriented programming\n";
    String materia3= "Software engineering\n";
    String materia4= "Operating Systems\n";

    //String classesForSemester= materia1+materia2+materia3+materia4;
    //System.out.println(classesForSemester);

    String classesForSemester2= String.format("%s%s%s%s", materia1,materia2,materia3,materia4);
    System.out.println(classesForSemester2);
    }
    
}