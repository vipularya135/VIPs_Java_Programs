package classes;

class xyz {
    int rollno;
    String name;

    void insert(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println("name is: " + name + ", rollno is: " + rollno);
    }
}

public class student2 {

    public static void main(String args[]) {

        xyz ob = new xyz();
        ob.rollno = 86;
        ob.name = "vip";
        System.out.println("details of user1 before insertion");
        ob.display();
        ob.insert(39, "arr");
        System.out.println("details of user1 after insertion");
        ob.display();

        xyz obj = new xyz();
        obj.rollno = 86000;
        obj.name = "vippppp";
        System.out.println("details of user2 before insertion");
        obj.display();
        obj.insert(3900, "arrrrrr");
        System.out.println("details of user2 after insertion");
        obj.display();
    }
}
