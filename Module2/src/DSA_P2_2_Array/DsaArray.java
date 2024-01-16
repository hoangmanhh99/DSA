/*
1. Tạo mảng danh sách sinh viên
2. Thêm sinh viên vào mảng theo chỉ mục như ở trên
3. In toàn bộ danh sách sinh viên ra màn hình
4. Tìm kiếm sinh viên có tên là  Nguyễn Văn A và in thông tin sinh viên đó ra màn hình.
5. Tìm sinh viên nhiều tuổi nhất và in ra màn hình
6. Tìm sinh viên ít tuổi nhất và in ra màn hình
7. Đổi chỗ sinh viên có chỉ số 0 với sinh viên cho chỉ số 3. In lại mảng ra màn hình.
*/
package DSA_P2_2_Array;

import DSA_P2_2_Data.Student;

import java.util.ArrayList;

public class DsaArray {
    // 1
    static ArrayList<Student> studentList = new ArrayList<Student>();

    static void addStudent(int index, Student value) {
        studentList.add(index, value);
    }

    static void printList() {
        for (Student i : studentList) {
            System.out.println(i.getValue());
        }
    }

    static String findStudent(String name) {
        for (Student i : studentList) {
            if (name.equals(i.getName())) {
                return i.getValue();
            }
        }
        return null;
    }

    static String oldestStudent() {
        Student oldest = null;
        for (Student i : studentList) {
            if (oldest == null || i.getAge() > oldest.getAge()) oldest = i;
        }
        return oldest != null ? oldest.getValue() : "";
    }

    static String youngestStudent() {
        Student youngest = null;
        for (Student i : studentList) {
            if (youngest == null || i.getAge() < youngest.getAge()) youngest = i;
        }
        return youngest != null ? youngest.getValue() : "";
    }

    public static void main(String[] args) {

        // 2
        Student student1 = new Student("Nguyễn Văn A", 10, "5D4");
        Student student2 = new Student("Nguyễn Văn B", 10, "4C3");
        Student student3 = new Student("Nguyễn Văn C", 10, "3B2");
        Student student4 = new Student("Nguyễn Văn D", 10, "2A1");

        addStudent(0, student1);
        addStudent(1, student2);
        addStudent(2, student3);
        addStudent(3, student4);

        // 3
        printList();

        // 4
        System.out.println("4. =============");
        System.out.println(findStudent("Nguyễn Văn A"));

        // 5
        System.out.println("5. =============");
        System.out.println(oldestStudent());

        // 6
        System.out.println("6. =============");
        System.out.println(youngestStudent());
    }
}
