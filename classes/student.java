package classes;
class sample{
    int rollno;
    String name;
    int age;
    void display(){
        System.out.println("name is: " + name + ", rollno is: " + rollno + ", age is: " + age);
    }
}

public class student{
    public static void main (String args[]){
        sample ob = new sample();
        ob.rollno = 86;
        ob.name = "vip";
        ob.age = 20;
        System.out.println("details of user1");
        ob.display();

        sample obj = new sample();
        obj.rollno = 860;
        obj.name = "vipul";
        obj.age = 20;
        System.out.println("details of user2");
        obj.display();
    }
}