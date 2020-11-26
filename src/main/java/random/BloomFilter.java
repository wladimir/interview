package random;

/**
 * Let’s take a bit array of size N and initialize each bit with binary zero. Now take some hash functions.
 *
 * hashFunction_1(192.170.0.1) : 2
 * hashFunction_2(192.170.0.1) : 6
 *
 * array[2] = 1, array[6] = 1
 *
 * When a Bloom filter says an element is not present it is for sure not present.
 * But when Bloom filter says the given element is present it is not 100% sure,
 * because there may be a chance due to collision all the bit of index given by hash functions has been set to 1 by other inputs.
 */
public class BloomFilter {
}
