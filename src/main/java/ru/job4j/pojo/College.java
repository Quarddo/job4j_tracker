package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Smirnov Anton Mironovich");
        student.setGroup("KD - 21");
        student.setReceiptDate("05.09.21");
        System.out.println("Полное имя студента: " + student.getFullName()
                + System.lineSeparator() + "Группа: "
                + student.getGroup() + System.lineSeparator()
                + "Дата поступления: " + student.getReceiptDate());
    }
}
