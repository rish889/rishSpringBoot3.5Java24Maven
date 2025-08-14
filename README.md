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
* Common Transactional Anomalies
  * Dirty Read: One transaction reads uncommitted changes from another transaction.
  * Non-repeatable Read: A transaction reads the same row multiple times, and gets different results each time.
  * Phantom Read: A transaction get different rows after re-execution of a range query if another transaction adds or removes some rows in the range and commits.
* IsolationLevels
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
* Propogation
  * REQUIRED 
    * Spring checks if there is an active transaction, and if nothing exists, it creates a new one. Otherwise, the business logic appends to the currently active transaction.
    * It is the default propagation
  * SUPPORTS
    * Spring first checks if an active transaction exists. If a transaction exists, then the existing transaction will be used. If there isn’t a transaction, it is executed non-transactional.
  * MANDATORY
    * If there is an active transaction, then it will be used. If there isn’t an active transaction, then Spring throws an exception.
  * NEVER
    * Spring throws an exception if there’s an active transaction.
  * NOT_SUPPORTED
    * If a current transaction exists, first Spring suspends it, and then the business logic is executed without a transaction
  * REQUIRES_NEW
    * Spring suspends the current transaction if it exists, and then creates a new one
  * NESTED 
    * Spring checks if a transaction exists, and if so, it marks a save point. 
    * This means that if our business logic execution throws an exception, then the transaction rollbacks to this save point. 
    * If there’s no active transaction, it works like REQUIRED.
* [Understanding Database Isolation Levels](https://medium.com/nerd-for-tech/understanding-database-isolation-levels-c4ebcd55c6b9)
* [Transaction Propagation and Isolation in Spring @Transactional](https://www.baeldung.com/spring-transactional-propagation-isolation)
* [Understanding Isolation Levels in Transactions with Java Spring](https://medium.com/@a.r.m.monesan_9577/understanding-isolation-levels-in-transactions-with-java-spring-c414b43b6df1)
* [Transactions with Spring and JPA](https://www.baeldung.com/transaction-configuration-with-jpa-and-spring)