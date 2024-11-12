package com.uptc.frw.ferialibrorest.controller;

import com.uptc.frw.ferialibrorest.jpa.models.Bill;
import com.uptc.frw.ferialibrorest.jpa.models.Person;
import com.uptc.frw.ferialibrorest.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bill")
public class BillController {
    @Autowired
    private BillService billService;
    @GetMapping
    public List<Bill> getAllBill() {
        return billService.findAll();
    }
    @GetMapping("{id}")
    public Bill getBillById(@PathVariable long id) {
        return billService.findById(id);
    }
    @PostMapping
    public Bill createBill(@RequestBody Bill bill){
        return billService.saveBill(bill);
    }

}
