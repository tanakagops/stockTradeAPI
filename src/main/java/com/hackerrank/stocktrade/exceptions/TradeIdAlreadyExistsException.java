/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank.stocktrade.exceptions;

/**
 *
 * @author gopozat
 */
public class TradeIdAlreadyExistsException extends RuntimeException {

    
    public TradeIdAlreadyExistsException() {    }
    public TradeIdAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }
    private String message;
}
