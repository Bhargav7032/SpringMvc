package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ciq.model.Customer;
import com.ciq.service.Customerservice;

@Controller
public class CustomerController {

	@Autowired
	private Customerservice customerservice; 
	
	
	@RequestMapping("/")
	public String home() {
		return "home";
		
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer() {
		return "addcustm";
		
	}
	
    @RequestMapping(value = "/savecustm", method = RequestMethod.POST)
	public String savecustm(Customer customer) {
		customerservice.add(customer);
		System.out.println(customer);
		return "redirect:/findallcustm";		
	}
    
    @RequestMapping(value = "/updatecustm",method = RequestMethod.POST)
    public String Updatecustm(Customer customer) {
    	customerservice.update(customer);
    	System.out.println(customer);
    	return "redirect:/findallcustm";    	
    }
	@RequestMapping("/findallcustm")
  	public String findAllCustm(Model model) {
  		List<Customer> customers = customerservice.findAll();
  		model.addAttribute("customers", customers);
  		return "findall";
	
   }

  	@RequestMapping("/deletecustmbyid")
  	public String deletecustmById(@RequestParam("cid") Integer cid) {
  		customerservice.deleteById(cid);
  		return "redirect:/findallcustm";
  	}
  	
  	@RequestMapping("/updatecustmbyid")
  	public String updateEmpById(@RequestParam("cid") Integer cid, Model model) {
  		Customer customer  = customerservice.findById(cid);
  		model.addAttribute("customer", customer);
  		return "update";
  	}
	
}