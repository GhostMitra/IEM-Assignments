class ClassNameLogic {
    void show() {
        System.out.println("Class Name: " + this.getClass().getName());
    }
}

public class Assignment_4 {
    public static void main(String[] args) {
        ClassNameLogic obj = new ClassNameLogic();
        obj.show();
    }
}
