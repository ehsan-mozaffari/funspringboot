package ir.itorg.funspringboot.technologyvitrine.api.rest.SampleCommunicatingWithREST;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Product: Maskan Core Banking System
 *
 * @author e.mozaffari on 4/6/2019 at 3:52 PM Section: Deposit Management
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String quote;

    public Value() {
    }

    public Long getId() {
        return this.id;
    }

    public String getQuote() {
        return this.quote;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Requested Get Response from Quote API" +
                "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }
}
