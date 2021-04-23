package com.example.demo.controlles;


import com.example.demo.entities.Order;
import com.example.demo.service.ClientService;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/commande")
@RestController
public class OrderController {
 //   @Autowired
   // OrderService orderService;
    //@Autowired
  //  ClientService clientService;




   // @PostMapping("/add")
    //public ResponseEntity<Order> addCommande(@RequestBody Order order){
       // Order newcommande = orderService.addcommande(order);

       //return new ResponseEntity<>(newcommande, HttpStatus.CREATED);}


   // @GetMapping("/all")
    //public ResponseEntity<List<Order>> findAllClients(){
     //   List<Order> order = orderService.findAllClients();
      //  return new ResponseEntity<>(order,HttpStatus.OK);
   // }


}
