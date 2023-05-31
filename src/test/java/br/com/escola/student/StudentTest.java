package br.com.escola.student;

import br.com.escola.utils.Email;
import br.com.escola.utils.Telephone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void shouldAddTelephonesWhenSuccessful(){
        StudentFactory studentFactory = new StudentFactory()
                .createStudentWithNameCPFAndEmail("vfv", "845.847.478-39", "dvvf@cgdv.com");
        studentFactory.getStudent().toAddTelephones("955", "854785485");

        Assertions.assertEquals(new Telephone("955", "854785485").getDdd(), studentFactory.getStudent().getTelephones().get(0).getDdd());
        Assertions.assertEquals(new Telephone("955", "854785485").getNumber(), studentFactory.getStudent().getTelephones().get(0).getNumber());

    }

    @Test
    void shouldThrowsIllegalArgumentsExceptionWhenTelephoneDddIsNotValid(){
        StudentFactory studentFactory = new StudentFactory()
                .createStudentWithNameCPFAndEmail("mdcbc", "847.555.585-55", "mdub@cdc.mdv");

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> studentFactory.getStudent().toAddTelephones("45", "748584854"));
    }

    @Test
    void shouldThrowsIllegalArgumentsExceptionWhenTelephoneNumberIsNotValid(){
        StudentFactory studentFactory = new StudentFactory()
                .createStudentWithNameCPFAndEmail("mdcbc", "847.555.585-55", "mdub@cdc.mdv");

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> studentFactory.getStudent().toAddTelephones("455", "7485848554"));
    }

    @Test
    void shouldReturnListOfTelephonesWhenSuccessful(){
        StudentFactory studentFactory = new StudentFactory()
                .createStudentWithNameCPFAndEmail("vfvs", "858.484.484-85", "mchd@cdc.com");

        studentFactory.getStudent().toAddTelephones("987", "666325252");
        studentFactory.getStudent().toAddTelephones("485", "665210256");

        Assertions.assertFalse(studentFactory.getStudent().getTelephones().isEmpty());
        Assertions.assertEquals(2, studentFactory.getStudent().getTelephones().size());

    }

    @Test
    void shouldReturnNameOfStudentWhenSuccessful(){
        StudentFactory studentFactory = new StudentFactory()
                .createStudentWithNameCPFAndEmail("cdcd", "847.478.584-55", "hdbbc@fvv.com");

        Assertions.assertEquals("cdcd", studentFactory.getStudent().getName());

    }

    @Test
    void shouldReturnEmailOfStudentWhenSuccessful(){
        StudentFactory studentFactory = new StudentFactory()
                .createStudentWithNameCPFAndEmail("cdcd", "847.478.584-55", "hdbbc@fvv.com");
        Email email = new Email("hdbbc@fvv.com");
        Assertions.assertEquals(email.getEmail(), studentFactory.getStudent().getEmail().getEmail());

    }

    //TODO: Adicionar mais testes para os outros metodos e outros cenarios.

}