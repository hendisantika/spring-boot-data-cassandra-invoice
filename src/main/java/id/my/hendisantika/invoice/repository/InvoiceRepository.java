package id.my.hendisantika.invoice.repository;

import id.my.hendisantika.invoice.model.Invoice;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-data-cassandra-invoice
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/13/24
 * Time: 15:59
 * To change this template use File | Settings | File Templates.
 */
public interface InvoiceRepository extends CassandraRepository<Invoice, Integer> {

    //Like other Database Repositories, some commonly used methods are already provided by CassandraRepository.
//Hence, we don't need to write those here. We can write custom methods.
//For example, below method is a custom method.
    @AllowFiltering
    List<Invoice> findByName(String name);
}
