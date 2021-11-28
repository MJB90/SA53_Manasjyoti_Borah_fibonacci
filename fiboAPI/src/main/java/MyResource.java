import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

@Path("/resource")
@Produces(MediaType.APPLICATION_JSON)
public class MyResource {

    @GET
    @Timed
    @Path("/fibonacci")
    public FiboResult fibonacci(@QueryParam("elements") Optional<String> elements) {
        int n = Integer.parseInt(elements.get());

        //Get the Fibonacci series of n elements
        BigInteger fibo[] = getFibonacci(n);

        //Convert the array to string
        String fibonacci = Arrays.toString(fibo);

        //Sort the fibonacci series in descending order
        Arrays.sort(fibo, Collections.reverseOrder());

        //Sort the fibonacci series
        String sorted = Arrays.toString(fibo);
        //Return a fibonacci result Json object
        System.out.println(sorted);
        return new FiboResult(fibonacci,sorted);
    }

    public BigInteger[] getFibonacci(int n){
        BigInteger[] a = new BigInteger[n];
        a[0] = new BigInteger("0");
        a[1] = new BigInteger("1");
        for(int i=2;i<n;i++){
            a[i] = new BigInteger(a[i-1].add(a[i-2]).toString());
        }
        return a;
    }

}