package br.com.escola.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CPFTest {

    @Test
    void shouldNotCreateCPFsWithInvalidAddresses() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CPF("85.4415.25-525"));
    }

    @Test
    void shouldCreateCPFsWithValidAddresses() {
        String cpfValid = "605.887.554-85";
        CPF cpf = new CPF(cpfValid);

        Assertions.assertEquals(cpfValid, cpf.getCpf());

    }

}