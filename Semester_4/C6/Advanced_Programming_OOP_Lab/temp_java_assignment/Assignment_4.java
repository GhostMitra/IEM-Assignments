package temp_java_assignment;
class ClassNameLogic {
    String show() {
        return "Class Name: " + this.getClass().getName();
    }
}

public class Assignment_4 {
    public static void main(String[] args) {
        ClassNameLogic obj = new ClassNameLogic();
        System.out.println(obj.show());
    }
}
