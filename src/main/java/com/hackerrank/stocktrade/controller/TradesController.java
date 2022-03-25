package com.hackerrank.stocktrade.controller;

import com.hackerrank.stocktrade.exceptions.TradeIdAlreadyExistsException;
import com.hackerrank.stocktrade.exceptions.TradeNotFoundException;
import com.hackerrank.stocktrade.model.Trade;
import com.hackerrank.stocktrade.model.User;
import com.hackerrank.stocktrade.service.TradeService;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/trades")
public class TradesController {

    @Autowired
    TradeService tradeService;

    // Erase all the trades
    @DeleteMapping(value = "/erase")
    public void eraseAllTrades() {
        tradeService.eraseAllTrades();
    }

    // Add new trade
    @PostMapping(value = "/trades")
    public Trade createTrade(@Valid @RequestBody Trade trade) {
        return tradeService.createTrade(trade);
    }

    // Creates a new trade
    @PostMapping("/trades")
    public ResponseEntity createTrade2(@RequestBody Trade trade) throws TradeIdAlreadyExistsException {
        Trade savedTrade = tradeService.createTrade(trade);
        return new ResponseEntity<>(savedTrade, HttpStatus.CREATED);
    }

    // Get a Trade by Id
    @GetMapping(value = "/trades/{id}")
    public Optional<Trade> getTrade2(@PathVariable("Id") Long id) {

        Optional<Trade> trade = tradeService.getTradeId(id);
        if (trade == null) {
            throw new TradeNotFoundException();
        }
        return tradeService.getTradeId(id);
    }

    // Gets all trades
    @GetMapping
    public Iterable<Trade> getAllTrades() {
        Iterable<Trade> savedTrade = tradeService.getAllTrades();
        return tradeService.getAllTrades();
          }
    
  
    
     // Get a Traderecord filtered by user id
  /*  @GetMapping(value = "/trades/users/{userid}")
    public Optional<Trade> getTradeByUserid(@QueryParam("userid") String id) {
      user = new user();
            user.getId();
       
    }*/
    
     
   
    

}
