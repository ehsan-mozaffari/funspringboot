package ir.itorg.funspringboot.technologyvitrine.api.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static ir.itorg.funspringboot.technologyvitrine.api.rest.SampleRestController.SAMPLE_REST_DIR;

//@Controller //You don't need Controller hence @RestController is inherited from @Controller
@RestController
@RequestMapping(value = SAMPLE_REST_DIR,
//                consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
public class SampleRestController {

    public static final String SAMPLE_REST_DIR = "/sample-rest-controller";
    private static final String TEST_DIR = "test";


    @RequestMapping(value = "test",
            method = RequestMethod.GET)
    public String getTest(){

        return "SampleRestController::getTest() is called.";
    }

    @RequestMapping(value = TEST_DIR + "/{name}", method = RequestMethod.GET)
    public HttpEntity<String> getName(@PathVariable String name){

        Boolean hasValidResponse = name.length() > 3;

        return new ResponseEntity<>(hasValidResponse ? "Your Name is: " + name : "Bad Request", hasValidResponse
                ? HttpStatus.OK
                : HttpStatus.BAD_REQUEST);
    }

}
