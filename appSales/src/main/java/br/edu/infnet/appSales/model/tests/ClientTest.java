/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.appSales.model.tests;

import br.edu.infnet.appSales.model.domain.Client;

/**
 *
 * @author alkin
 */
public class ClientTest {
    public static void main(String[] args) {
        Client client1 = new Client("João", "132223232332", "asda@asdasd.com");
        System.out.println(client1);
    }
}
