package br.com.escola.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmailTest {

    @Test
    void shouldNotCreateEmailsWithInvalidAddresses() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(""));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email("mcgc@cdcdc"));
    }

    @Test
    void shouldCreateEmailsWithValidAddresses() {
        String emailValid = "mateus@gmail.com";
        Email email = new Email(emailValid);

        Assertions.assertEquals(emailValid, email.getEmail());

    }

}