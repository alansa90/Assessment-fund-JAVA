/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.appSales.model.domain;

/**
 *
 * @author Alan Sá
 */
public class Client {
    private String name;
    private String cpf;
    private String email;

    public Client(String name, String cpf, String email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(";");
        sb.append(cpf);
        sb.append(";");
        sb.append(email);

        return sb.toString();
    }

    public String getNome() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
}
