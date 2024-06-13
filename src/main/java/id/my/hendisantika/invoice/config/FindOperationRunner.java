package id.my.hendisantika.invoice.config;

import id.my.hendisantika.invoice.model.Invoice;
import id.my.hendisantika.invoice.repository.InvoiceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-data-cassandra-invoice
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/13/24
 * Time: 16:05
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Component
public class FindOperationRunner implements CommandLineRunner {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public void run(String... args) throws Exception {

        //Retrieve all records using findAll() method
        List<Invoice> invoices = invoiceRepository.findAll();
        invoices.forEach(System.out::println);

        //Retrieve record by Id using findById() method
        Optional<Invoice> opt = invoiceRepository.findById(5);
        if (opt.isPresent()) {
            log.info(opt.get().getName());
        }

        //Retrieve records by invoice name using findByName() method
        List<Invoice> invoicesByName = invoiceRepository.findByName("Inv4");
        invoicesByName.forEach(System.out::println);

    }
}
