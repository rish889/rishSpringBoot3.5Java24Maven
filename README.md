# rishSpringBoot3.5Java24Maven
* https://github.com/rish889/rishFeb2024/tree/main
* https://github.com/rish889/rishSpringShop
* https://www.baeldung.com/spring-boot-clean-architecture

# Database
* https://www.baeldung.com/spring-boot-h2-database
* http://localhost:8080/h2-console
* user : sa
* password : password

# Transactions
* [Transaction Propagation and Isolation in Spring @Transactional](https://www.baeldung.com/spring-transactional-propagation-isolation)
* [Understanding Isolation Levels in Transactions with Java Spring](https://medium.com/@a.r.m.monesan_9577/understanding-isolation-levels-in-transactions-with-java-spring-c414b43b6df1)
* [Transactions with Spring and JPA](https://www.baeldung.com/transaction-configuration-with-jpa-and-spring)
* ReadUncommitted : Cannot update row if another transaction has updated it but not committed.
* ReadCommitted : Cannot read row if another transaction has updated it but not committed.
* RepeatableRead : Another transaction cannot update the row.
* Serializable : Typically locks the whole table.
* Snapshot : Same guarantees as serializable but more performant.