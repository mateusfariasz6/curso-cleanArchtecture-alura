package br.com.escola.student;

import br.com.escola.utils.CPF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {

    @Test
    void shouldCreateStudentWithNameCPFAndEmail() {
        StudentFactory studentFactory = new StudentFactory();
        studentFactory.createStudentWithNameCPFAndEmail("matec", "854.487.587-52","mdyvdbc@dcd.com");

        Assertions.assertEquals( new CPF("854.487.587-52").getCpf(), studentFactory.getStudent().getCpf().getCpf());
    }

    @Test
    void shouldThrowsIllegalArgumentsExceptionWhenCpfIsNotValid(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new StudentFactory().createStudentWithNameCPFAndEmail("mdcbc", "847.5552.585-55", "mdub@cdc.com"));

    }

    @Test
    void shouldThrowsIllegalArgumentsExceptionWhenEmailIsNotValid(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new StudentFactory().createStudentWithNameCPFAndEmail("mdcbc", "847.555.585-55", "mdub@cdc.m"));

    }

    @Test
    void shouldCreateStudentWithTelephone() {
        StudentFactory studentFactory = new StudentFactory()
                .createStudentWithNameCPFAndEmail("cdcd", "854.847.958-98", "mdccb@dcvgd.com")
                .withTelephone("085", "984745215");

        Student student = studentFactory.getStudent();

        Assertions.assertEquals(studentFactory.getStudent().getTelephones().get(0), student.getTelephones().get(0));
        Assertions.assertEquals(studentFactory.getStudent().getCpf(), student.getCpf());
    }

    @Test
    void shouldThrowsIllegalArgumentsExceptionWhenTelephoneDddIsNotValid(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new StudentFactory()
                        .createStudentWithNameCPFAndEmail("mdcbc", "847.555.585-55", "mdub@cdc.mvd")
                        .withTelephone("55", "985847585"));

    }

    @Test
    void shouldThrowsIllegalArgumentsExceptionWhenTelephoneNumberIsNotValid(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new StudentFactory()
                        .createStudentWithNameCPFAndEmail("mdcbc", "847.555.585-55", "mdub@cdc.m")
                        .withTelephone("505", "85847585"));

    }

    @Test
    void shouldReturnStudentWhenSuccessful() {
        StudentFactory studentFactory = new StudentFactory().createStudentWithNameCPFAndEmail("CDcd", "847.478.845-95", "nchbd@cdc.ond")
                .withTelephone("844", "848454854");

        Student student = studentFactory.getStudent();

        Assertions.assertEquals(studentFactory.getStudent().getCpf().getCpf(), student.getCpf().getCpf());



    }
}