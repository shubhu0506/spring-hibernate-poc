package com.example.demo.controller;

import com.example.demo.model.Address;
import com.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping(value = "/addresses",
            produces = {"application/json"})
    ResponseEntity<List<Address>> getAllAddress() {
        return ResponseEntity.ok().body(addressService.getAllAddress());
    }


    @PostMapping(value = "/address",
            produces = {"application/json"})
    ResponseEntity<Address> postAddress(@RequestBody Address address) {
        return ResponseEntity.ok().body(addressService.saveAddress(address));
    }
}
