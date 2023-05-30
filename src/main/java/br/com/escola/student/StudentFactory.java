package br.com.escola.student;

import br.com.escola.utils.CPF;
import br.com.escola.utils.Email;

public class StudentFactory {
    private Student student;
    public StudentFactory createStudentWithNameCPFAndEmail(String name, String cpf, String email){
        this.student = new Student(name, new CPF(cpf), new Email(email));
        return this;
    }
    public StudentFactory withTelephone(String ddd, String number){
        this.student.toAddTelefones(ddd, number);
        return this;
    }

    public Student getStudent() {
        return student;
    }
}
