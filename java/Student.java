public class Student {
    String name;
    int age;
    boolean isJunior;
    char gender;
    public Student() {
       name ="--";
       age=0;
       isJunior=true;
       gender='M';
    }
  public  Student(String name, int age, boolean isJunior, char gender) {
        this.name=name;
        this.age=age;
        this.isJunior=isJunior;
        this.gender=gender;



    }

    static void main(String[] args) {
Student student1=new Student();
student1.info();
student1.name="İlaydanur";
student1.age=21;
student1.isJunior=true;
student1.gender='F';
        student1.info();



    }
    public void info() {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("isJunior:"+isJunior);
        System.out.println("gender:"+gender);




    }
}
