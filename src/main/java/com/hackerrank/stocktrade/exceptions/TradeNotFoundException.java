/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank.stocktrade.exceptions;

/**
 *
 * @author gopozat
 */
public class TradeNotFoundException  extends RuntimeException{

    
    public TradeNotFoundException() {    }
    public TradeNotFoundException(String message) {
        super(message);
        this.message = message;
    }
    private String message;
}  

/*


       @GetMapping(value = "/trades/{Id}")
     public ResponseEntity getTradeId(@PathVariable("Id") Long Id) throws TradeNotFoundException{ 
         Trade Savedtrade =  tradeService.getTradeId(Id);
      if(Savedtrade == null)           
        return new ResponseEntity<>(Savedtrade,HttpStatus.NOT_FOUND);
        }
*/