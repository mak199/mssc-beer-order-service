package guru.sfg.beer.order.service.services;

import guru.sfg.beer.order.service.domain.Customer;
import guru.sfg.brewery.model.CustomerPagedList;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    CustomerPagedList listCustomers(Pageable pageable);
}
