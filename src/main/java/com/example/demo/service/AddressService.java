package com.example.demo.service;

import com.example.demo.model.Address;

import java.util.List;

public interface AddressService {

   Address saveAddress(Address address);

   List<Address> getAllAddress();
}
