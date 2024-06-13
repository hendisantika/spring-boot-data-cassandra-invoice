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
 * Time: 16:02
 * To change this template use File | Settings | File Templates.
 */
@Component
public class SaveOrInsertOperationRunner implements CommandLineRunner {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public void run(String... args) throws Exception {
        //saving one record into Cassandra DB using save() method
        Invoice inv = new Invoice(1, "Inv1", "POS34523", 295.74);

        //saving multiple records into Cassandra DB using saveAll() method
        //saving multiple records into Cassandra DB using saveAll() method
        invoiceRepository.saveAll(List.of(
                        new Invoice(2, "Inv2", "POS34522", 292.00),
                        new Invoice(3, "Inv3", "QOS34523", 293.75),
                        new Invoice(4, "Inv4", "ROS34524", 294.34),
                        new Invoice(5, "Inv5", "SOS34525", 295.95),
                        new Invoice(6, "Inv6", "TOS34526", 296.54),
                        new Invoice(8, "Inv4", "WQS34528", 247.45)
                )
        );

        //saving one record into Cassandra DB using insert() method
        invoiceRepository.insert(new Invoice(7, "Inv7", "VOS34527", 297.65));
    }
}
