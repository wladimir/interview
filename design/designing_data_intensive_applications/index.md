Desiging data-intensive applications:

Twitter, fan-out, hot users hybrid approach
response times as distribution, percentiles
High percentiles become especially important in backend services that are called mul‐ tiple times as part of serving a single end-user request.
Even if only a small percentage of backend calls are slow, the chance of getting a slow call increases if an end-user request requires multiple back‐ end calls, and so a higher proportion of end-user requests end up being slow (an effect known as tail latency amplification.

Leader-based replication: sync or async
write ahead log
If we know that every successful write is guaranteed to be present on at least two out of three replicas, that means at most one replica can be stale. Thus, if we read from at least two replicas, we can be sure that at least one of the two is up to date. If the third replica is down or slow to respond, reads can nevertheless continue returning an up- to-date value.
More generally, if there are n replicas, every write must be confirmed by w nodes to be considered successful, and we must query at least r nodes for each read. (In our example, n = 3, w = 2, r = 2.) As long as w + r > n, we expect to get an up-to-date value when reading, because at least one of the r nodes we’re reading from must be up to date. Reads and writes that obey these r and w values are called quorum reads and writes. You can think of r and w as the minimum number of votes required for the read or write to be valid.

The word consistency is terribly overloaded:
• In Chapter 5 we discussed replica consistency and the issue of eventual consis‐ tency that arises in asynchronously replicated systems
• Consistent hashing is an approach to partitioning that some systems use for rebalancing
• In the CAP theorem (see Chapter 9), the word consistency is used to mean linearizability
• In the context of ACID, consistency refers to an application-specific notion of the database being in a “good state.”

several weak (nonserializable) isolation levels:
* read committed: no dirty reads (simply return old value, do not lock) or dirty writes (by row-level locks)
* snapshot isolation/repeatable read: the database must potentially keep several different committed versions of an object, because various in-progress transactions may need to see the state of the database at different points in time. Because it maintains several versions of an object side by side, this technique is known as multi-version concurrency control (MVCC))
* preventing lost updates (read-modify-write): atomic write vs explicit locking vs compare-and-set; comutative atomic operations but not last write wins
* write skew: repeated SELECT returns different results (phantom) -> serializable isolation (as if executed serially); stored procedures; two-phase-locking
* serializable snapshot isolation (SSI) -> optimistic

internet shares network bandwidth dynamically, vs static phone line.
System.currentTimeMillis() -> time of day clock; System.nanoTime() -> monotonic clock; guaranteed to always move forward
even though it is tempting to resolve conflicts by keeping the most “recent” value and discarding others, it’s important to be aware that the definition of “recent” depends on a local time-of-day clock, which may well be incorrect.
The Truth Is Defined by the Majority
GC pauses
Fencing tokens can detect and block a node that is _inadvertently_ acting in error
The Byzantine Generals Problem: In the Byzantine version of the problem, there are n generals who need to agree, and their endeavor is hampered by the fact that there are some traitors in their midst. Most of the generals are loyal, and thus send truthful messages, but the traitors may try to deceive and confuse the others by sending fake or untrue messages (while trying to remain undiscovered). It is not known in advance who the traitors are.

Linearizability (also known as atomic consistency, strong consistency, immediate consistency) describes reads and writes on a single object (stores a single value). it doesn’t involve multiple objects. It doesn’t involve “transaction”, which groups multiple objects. It treats each operation as an atom, i.e. to take effect in a single time point, rather than a timespan.

Serializability describes multiple transactions, where a transaction is usually composed of multiple operations on multiple objects.
Database can executed transactions in parallel (and the operations in parallel). Serializability guarantees the result is the same with, as if the transactions were executed one by one. i.e. to behave like executed in a serial order.

If your application requires linearizability, and some replicas are disconnected from the other replicas due to a network problem, then some replicas cannot process requests while they are disconnected: they must either wait until the net‐ work problem is fixed, or return an error (either way, they become unavailable).
• If your application does not require linearizability, then it can be written in a way that each replica can process requests independently, even if it is disconnected from other replicas (e.g., multi-leader). In this case, the application can remain available in the face of a network problem, but its behavior is not linearizable
a better way of phrasing CAP would be either Consistent or Available when Partitioned

Quorum protocols define an epoch number and guarantee that within each epoch, the leader is unique. For every decision that a leader wants to make, it must send the proposed value to the other nodes and wait for a quorum of nodes to respond in favor of the proposal. Consensus systems generally rely on timeouts to detect failed nodes.

Paxos:

Why is distributed consensus an important problem?
If we can get all machines to agree upon some value in a consistent manner, we get resiliency in the face of temporary machine failures and thus higher availability of the system
Why is distributed consensus a challenging problem?
The machines have to agree upon a common value while communicating with each other over an unreliable network; furthermore the system should be able to gracefully handle the failure of a few machines


Hexagonal architecture:
Ports - business logic is isolated. UserRepo -> save, knows only about interface. Save can save to db, or via network call.
Make the core of the system interact through ports

Microservices:
This is reinforced by Robert C. Martin’s definition of the SingleResponsibility Principle, which states “Gather together those things that change for the same reason, and separate those things that change for different reasons.”

Software architect -> town planner, divides city in zones. “Be worried about what happens between the boxes, and be liberal in what happens inside.”
