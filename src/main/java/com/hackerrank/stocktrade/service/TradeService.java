/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank.stocktrade.service;

import com.hackerrank.stocktrade.model.Trade;
import com.hackerrank.stocktrade.repository.TradeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gopozat
 */
@Service
public class TradeService {
    
   @Autowired
    private TradeRepository tradeRepository;
   
   
   // Erase all the trades
    public void eraseAllTrades() {
       // empRepository.deleteById(empId);
       tradeRepository.deleteAll();
    }
   
   // Creates a new trade
    public Trade createTrade(Trade trade) {
         return tradeRepository.save(trade);
    }

 
       // Get a Trade by Id
    public Optional <Trade> getTradeId(Long Id) {
        return tradeRepository.findById(Id);
    }
    
// Gets all trades
    public Iterable<Trade> getAllTrades() {
        return tradeRepository.findAll();
    }
    
 


    
    // UPDATE
public Employee updateEmployee(Long empId, Employee employeeDetails) {
        Employee emp = empRepository.findById(empId).get();
        emp.setFirstName(employeeDetails.getFirstName());
        emp.setLastName(employeeDetails.getLastName());
        emp.setEmailId(employeeDetails.getEmailId());
        
        return empRepository.save(emp);                                
}*/
}
