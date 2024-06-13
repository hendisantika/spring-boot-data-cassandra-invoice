package id.my.hendisantika.invoice.config;

import id.my.hendisantika.invoice.model.Invoice;
import id.my.hendisantika.invoice.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-data-cassandra-invoice
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/13/24
 * Time: 16:07
 * To change this template use File | Settings | File Templates.
 */
@Component
public class DeleteOperationRunner implements CommandLineRunner {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public void run(String... args) throws Exception {

        //Remove a record where id=2 using deleteById() method
        invoiceRepository.deleteById(2);

        //Retrieve all records using findAll() method
        List<Invoice> invoices = invoiceRepository.findAll();
        invoices.forEach(System.out::println);
    }
}
