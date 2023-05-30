package br.com.escola.utils;

public class Email {
    private String email;

    public Email(String email){
        if (email == null || !email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new IllegalArgumentException("Email fornecido não atende aos padrões de um email!");
        }
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
