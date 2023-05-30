package br.com.escola.student;

import br.com.escola.utils.Email;
import br.com.escola.utils.CPF;
import br.com.escola.utils.Telephone;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private CPF cpf;
    private Email email;
    private List<Telephone> telephones = new ArrayList<>();

    public Student(){

    }

   public Student(String name, CPF cpf, Email email){
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    public void toAddTelefones(String ddd, String number){
        this.telephones.add(new Telephone(ddd, number));
    }

    public String getName() {
        return name;
    }

    public CPF getCpf() {
        return cpf;
    }

    public Email getEmail() {
        return email;
    }

    public void listTelefones(){
        for(Telephone telephone : this.telephones){
            System.out.println(telephone.toString());
        }
    }

    public List<Telephone> getTelefones(){
        return this.telephones;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", cpf=" + cpf.getCpf() +
                ", email=" + email.getEmail() +
                '}';
    }
}
