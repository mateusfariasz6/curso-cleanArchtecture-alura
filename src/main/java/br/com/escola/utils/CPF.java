package br.com.escola.utils;

public class CPF {

    private String cpf;
   public CPF(String cpf){

        String regexCpf = "^[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}$";

        if(cpf == null || !cpf.matches(regexCpf)){
            throw new IllegalArgumentException("O CPF fornecido não atende aos padrões de um CPf!");
        }
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
