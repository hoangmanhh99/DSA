package DSA_P2_2_Data;/*
1. Tạo ra một sinh viên với các thông tin như sau: Tên là Nguyễn Văn A, 6 tuổi và học lớp 1A3
2. In thông tin của sinh viên đó ra màn hình với định dạng như sau: Name: Nguyễn Văn A - Age: 6 - Class: 1A3
3. Chuyển sinh viên đó sang lớp 1A7
4. Xóa bỏ dữ liệu của sinh viên A
*/

public class Student {
    private String name;
    private int age;
    private String className;

    public Student(String name, int age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public static void main(String[] args) {
        Student student = new Student("Nguyễn Văn A", 6, "1A3");
        // 2
        System.out.println("Name: " + student.name + " - Age: " + student.age + " - Class: " + student.className);

        // 3
        student.className = "1A7";
        System.out.println("Name: " + student.name + " - Age: " + student.age + " - Class: " + student.className);

        // 4
        student = null;
        System.out.println(student);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }

    public String getValue() {
        return name + " " + age + " " + className;
    }
}
