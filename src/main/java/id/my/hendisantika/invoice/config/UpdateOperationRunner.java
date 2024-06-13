package id.my.hendisantika.invoice.config;

import id.my.hendisantika.invoice.model.Invoice;
import id.my.hendisantika.invoice.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-data-cassandra-invoice
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/13/24
 * Time: 16:04
 * To change this template use File | Settings | File Templates.
 */
@Component
public class UpdateOperationRunner implements CommandLineRunner {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public void run(String... args) throws Exception {

        //Update Invoice Number from 'Inv1' to 'Inv01' using save() where id=1
        invoiceRepository.save(new Invoice(1, "Inv01", "POS34523", 295.74));

        //Update Invoice Amount from '294.34' to '395.24' using insert() where id=4
        invoiceRepository.insert(new Invoice(4, "Inv4", "ROS34524", 395.24));
    }
}
