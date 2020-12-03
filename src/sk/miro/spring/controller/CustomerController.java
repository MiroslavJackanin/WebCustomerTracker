package sk.miro.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.miro.spring.dao.CustomerDAO;
import sk.miro.spring.entity.Customer;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    //@Autowired
    //private CustomerDAO customerDAO;

    @RequestMapping("/list")
    public String customerList(Model model){

        //List<Customer> customers = customerDAO.getCustomers();
        //model.addAttribute("customers", customers);

        return "customer-list";
    }
}
