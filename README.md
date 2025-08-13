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
* ReadUncommitted
  * Can read uncommitted changes made by other transactions, leading to dirty reads.
  * Cannot update row if another transaction has updated it but not committed.
* ReadCommitted
  * Can only read changes made by other transactions once they are committed.
  * This avoids dirty reads but allows non-repeatable reads and phantom reads.
  * Cannot read row if another transaction has updated it but not committed.
* RepeatableRead
  * Ensures that if a transaction reads a row, any subsequent reads will return the same data. 
  * However, phantom reads can still occur.
  * Another transaction cannot update the row.
* Serializable
  * Transactions are executed sequentially, ensuring no anomalies (dirty reads, non-repeatable reads, or phantom reads).
  * However, this can lead to performance bottlenecks.
  * Typically, locks the whole table.
* Snapshot
  * Same guarantees as serializable but more performant.
* [Understanding Database Isolation Levels](https://medium.com/nerd-for-tech/understanding-database-isolation-levels-c4ebcd55c6b9)
* [Transaction Propagation and Isolation in Spring @Transactional](https://www.baeldung.com/spring-transactional-propagation-isolation)
* [Understanding Isolation Levels in Transactions with Java Spring](https://medium.com/@a.r.m.monesan_9577/understanding-isolation-levels-in-transactions-with-java-spring-c414b43b6df1)
* [Transactions with Spring and JPA](https://www.baeldung.com/transaction-configuration-with-jpa-and-spring)