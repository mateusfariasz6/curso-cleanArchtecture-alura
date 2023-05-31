package br.com.escola;

import br.com.escola.student.Student;
import br.com.escola.student.StudentFactory;

public class Main {
    public static void main(String[] args) {
        StudentFactory studentFactory = new StudentFactory();
        studentFactory.createStudentWithNameCPFAndEmail("ddc", "954.478.874-95", "mdubd@dgdc.com")
                .withTelephone("085", "895858474")
                .withTelephone("085", "984747584");

        System.out.println(studentFactory.getStudent().toString());
        studentFactory.getStudent().listTelephones();
    }
}