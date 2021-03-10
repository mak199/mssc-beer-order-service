package guru.sfg.brewery.model;

import guru.sfg.beer.order.service.domain.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;


public class CustomerPagedList extends PageImpl<CustomerDto> {
    public CustomerPagedList(List<CustomerDto> content, Pageable pageable, long total){
        super(content,pageable,total);
    }

    public CustomerPagedList(List<CustomerDto> content){
        super(content);
    }


}
