/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank.stocktrade.repository;

import com.hackerrank.stocktrade.model.Trade;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author gopozat
 */
public interface TradeRepository extends CrudRepository<Trade,Long>{
    
}
