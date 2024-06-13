# spring-boot-data-cassandra-invoice

### Things todo list

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-data-cassandra-invoice.git`
2. Navigate to the folder: `cd spring-boot-data-cassandra-invoice`
3. Make sure your Cassandra Instance is UP & Running well
4. Run the application: `mvn clean spring-boot:run`
5. Check console log:

```shell
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.0)

2024-06-13T16:09:37.927+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] pringBootDataCassandraInvoiceApplication : Starting SpringBootDataCassandraInvoiceApplication using Java 21 with PID 72777 (/Users/hendisantika/IdeaProjects/spring-boot-data-cassandra-invoice/target/classes started by hendisantika in /Users/hendisantika/IdeaProjects/spring-boot-data-cassandra-invoice)
2024-06-13T16:09:37.928+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] pringBootDataCassandraInvoiceApplication : No active profile set, falling back to 1 default profile: "default"
2024-06-13T16:09:37.952+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2024-06-13T16:09:37.952+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2024-06-13T16:09:38.300+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Reactive Cassandra repositories in DEFAULT mode.
2024-06-13T16:09:38.315+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 12 ms. Found 0 Reactive Cassandra repository interfaces.
2024-06-13T16:09:38.317+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Cassandra repositories in DEFAULT mode.
2024-06-13T16:09:38.323+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 6 ms. Found 1 Cassandra repository interface.
2024-06-13T16:09:38.557+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2024-06-13T16:09:38.565+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-06-13T16:09:38.565+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.24]
2024-06-13T16:09:38.589+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-06-13T16:09:38.589+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 637 ms
2024-06-13T16:09:38.739+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] c.d.o.d.i.core.DefaultMavenCoordinates   : Apache Cassandra Java Driver (org.apache.cassandra:java-driver-core) version 4.18.1
2024-06-13T16:09:38.796+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] c.d.o.d.i.c.c.CqlPrepareAsyncProcessor   : Adding handler to invalidate cached prepared statements on type changes
2024-06-13T16:09:39.115+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [     s0-admin-0] c.d.oss.driver.internal.core.time.Clock  : Using native clock for microsecond precision
2024-06-13T16:09:39.456+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] o.s.d.c.config.CqlSessionFactoryBean     : Executing CQL [CREATE KEYSPACE IF NOT EXISTS invoice WITH durable_writes = true AND replication = { 'class' : 'SimpleStrategy', 'replication_factor' : 3 };]
2024-06-13T16:09:40.664+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] c.d.o.d.i.c.c.CqlPrepareAsyncProcessor   : Adding handler to invalidate cached prepared statements on type changes
2024-06-13T16:09:40.664+07:00  WARN 72777 --- [spring-boot-data-cassandra-invoice] [     s0-admin-0] c.d.o.d.i.core.cql.CqlRequestHandler     : Query '[0 values] CREATE KEYSPACE IF NOT EXISTS invoice WITH durable_writes = true AND replication = { 'class' : 'SimpleStrategy', 'replication_factor' : 3 };' generated server side warning(s): Your replication factor 3 for keyspace invoice is higher than the number of nodes 1
2024-06-13T16:09:40.664+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [     s1-admin-0] c.d.oss.driver.internal.core.time.Clock  : Using native clock for microsecond precision
2024-06-13T16:09:40.818+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2024-06-13T16:09:42.469+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2024-06-13T16:09:42.474+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] pringBootDataCassandraInvoiceApplication : Started SpringBootDataCassandraInvoiceApplication in 4.697 seconds (process running for 5.178)
Invoice(id=5, name=Inv5, number=SOS34525, amount=295.95)
Invoice(id=8, name=Inv4, number=WQS34528, amount=247.45)
Invoice(id=2, name=Inv2, number=POS34522, amount=292.0)
Invoice(id=4, name=Inv4, number=ROS34524, amount=294.34)
Invoice(id=7, name=Inv7, number=VOS34527, amount=297.65)
Invoice(id=6, name=Inv6, number=TOS34526, amount=296.54)
Invoice(id=3, name=Inv3, number=QOS34523, amount=293.75)
2024-06-13T16:09:42.562+07:00  INFO 72777 --- [spring-boot-data-cassandra-invoice] [  restartedMain] i.m.h.i.config.FindOperationRunner       : Inv5
Invoice(id=8, name=Inv4, number=WQS34528, amount=247.45)
Invoice(id=4, name=Inv4, number=ROS34524, amount=294.34)
Invoice(id=5, name=Inv5, number=SOS34525, amount=295.95)
Invoice(id=1, name=Inv01, number=POS34523, amount=295.74)
Invoice(id=8, name=Inv4, number=WQS34528, amount=247.45)
Invoice(id=4, name=Inv4, number=ROS34524, amount=395.24)
Invoice(id=7, name=Inv7, number=VOS34527, amount=297.65)
Invoice(id=6, name=Inv6, number=TOS34526, amount=296.54)
Invoice(id=3, name=Inv3, number=QOS34523, amount=293.75)
```
