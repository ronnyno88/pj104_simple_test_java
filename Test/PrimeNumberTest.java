package Test;

import Repository.PrimeNumber;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    private PrimeNumber prime = new PrimeNumber();

    @Test
    void testIsPrime(){
        assertTrue(prime.isPrime(3));
        //assertEquals(true, prime.isPrime(1));
        //assertEquals(true, prime.isPrime(6));
    }

}

