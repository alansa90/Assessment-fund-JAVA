/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.appSales.model.exceptions;

/**
 *
 * @author Alan Sá
 */
public class EmptyAddressException extends Exception{
    public EmptyAddressException(String message) {
        super(message);
    }
}