package ir.itorg.funspringboot.technologyvitrine.api.rest.SampleCommunicatingWithREST;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Product: Maskan Core Banking System
 *
 * @author e.mozaffari on 4/6/2019 at 3:51 PM Section: Deposit Management
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Value getValue() {
        return value;
    }
    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
