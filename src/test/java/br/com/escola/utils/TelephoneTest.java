package br.com.escola.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TelephoneTest {

    @Test
    void shouldNotCreateTelefonesWithInvalidAddresses() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telephone(null, null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telephone("", ""));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telephone("85", "52525"));
    }

    @Test
    void shouldCreateEmailsWithValidAddresses() {
        String dddValid = "085";
        String numberValid = "985854548";
        Telephone telephone = new Telephone(dddValid, numberValid);

        Assertions.assertEquals(dddValid, telephone.getDdd());
        Assertions.assertEquals(numberValid, telephone.getNumber());
    }

}