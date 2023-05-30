package br.com.escola.utils;

public class Telephone {
    private String ddd;
    private String number;

    public Telephone(){

    }
    public Telephone(String ddd, String number){
        String dddRegex = "^[0-9]{3}$";
        String numberRegex = "^[0-9]{9}$";
        if (ddd == null || number == null || !ddd.matches(dddRegex) || !number.matches(numberRegex)){

            throw new IllegalArgumentException("O DDD ou o número do telefone não atendem aos padrões!");
        }
        this.ddd = ddd;
        this.number = number;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "("+ddd+") "+number;
    }
}
