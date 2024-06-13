package id.my.hendisantika.invoice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-data-cassandra-invoice
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/13/24
 * Time: 15:58
 * To change this template use File | Settings | File Templates.
 */
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    @PrimaryKey
    private Integer id;
    private String name;
    private String number;
    private Double amount;
}
