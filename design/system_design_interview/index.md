* rate limiter
    * token bucket - container with predefined capacity, refilled periodically, bucket size / refill rate
    * leaking bucket - similar to token bucket, but requests are processed at fixed rate (usually a FIFO queue)
    * fixed window counter - split to fixed-size time windows, vulnerable to spikes at edges of window
    * sliding window log - rolling window, consumes memory
    * sliding window counter
    
* consistent hashing
    * consistent hashing is a special kind of hashing such that when a hash table is re-sized and consistent hashing is used, only k/n keys need to be remapped on average, where k is the number of keys, and n is the number of slots. In contrast, in most traditional hash tables, a change in the number of array slots causes nearly all keys to be remapped 
    * ring, clockwise server lookup
    * virtual nodes solve non-uniform key distribution

* key-value store
    * gossip - node membership and heartbeat counters, propagated to other nodes
    * temporary failure - sloppy quorum
    * permanent failure - sync, Merkle tree
    
* unique id generator
    * twitter snowflake
