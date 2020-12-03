package sk.miro.spring.dao;

import sk.miro.spring.entity.Customer;
import java.util.List;

public interface CustomerDAO {

    List<Customer> getCustomers();
}
