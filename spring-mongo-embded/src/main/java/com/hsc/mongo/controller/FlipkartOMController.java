package com.hsc.mongo.controller;

import com.hsc.mongo.model.User;
import com.hsc.mongo.repository.FlipkartOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(name = "/order")
public class FlipkartOMController {
    @Autowired
    FlipkartOrder flipkartOrder;

    @PostMapping("/product_order")
    public String placeOrder(@RequestBody User user) {
        flipkartOrder.save(user);
        return "order place successfully";
    }

    @GetMapping("/getByName/{name}")
    public List<User> getListByName(@PathVariable String name) {

        return flipkartOrder.findByName(name);
    }

    @GetMapping("/getByCity/{city}")
    public List<User> getListByAddress(@PathVariable String city){
        return flipkartOrder.findByCity(city);
    }

}
