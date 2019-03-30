package ir.itorg.funspringboot.technologyvitrine.api.rest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static ir.itorg.funspringboot.technologyvitrine.api.rest.SampleRestController2.SAMPLE_REST_DIR2;


@Controller
@RestController
@RequestMapping(value = SAMPLE_REST_DIR2,
//                consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
public class SampleRestController2 {


    public static final String SAMPLE_REST_DIR2 = "/sample-rest-controller2";

    @RequestMapping(value = "test",
                    method = RequestMethod.GET)
    public String getTest(){

        return "SampleRestController2::getTest() is called.";
    }
}
