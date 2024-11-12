package com.uptc.frw.ferialibrorest.service;

import com.uptc.frw.ferialibrorest.jpa.models.Bill;
import com.uptc.frw.ferialibrorest.jpa.models.Person;
import com.uptc.frw.ferialibrorest.jpa.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {
    @Autowired
    private BillRepository billRepository;
    @Autowired
    private PersonService personService;
    public List<Bill> findAll() {
        return billRepository.findAll();
    }
    public Bill findById(Long id){
        return billRepository.findById(id).orElse(null);
    }
    public Bill saveBill(Bill bill){
        Person person = personService.findById(bill.getPersonId());
        bill.setPerson(person);
        return billRepository.save(bill);
    }

}
