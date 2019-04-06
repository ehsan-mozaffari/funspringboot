package ir.itorg.funspringboot.technologyvitrine.api.rest.SampleCommunicatingWithREST;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Product: Maskan Core Banking System
 *
 * @author e.mozaffari on 4/6/2019 at 3:48 PM Section: Deposit Management
 */
@RestController
@RequestMapping(//consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class SampleCommunicatingWithRest {

    // Spring provides a convenient template class called RestTemplate. RestTemplate makes
    // interacting with most RESTful services a one-line incantation.
    // And it can even bind that data to custom domain types.
    @RequestMapping(value = "get-quote",
            method = RequestMethod.GET)
    public String getQuote(){

        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);

        return quote.toString();
    }

    @RequestMapping()
    public String helloWorld(){

        return "Hello there. run localhost:8080/get-quote to get an example quotes from Spring QUOTE API";
    }
}
