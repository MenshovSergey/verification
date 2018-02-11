package model.diagram;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Setter;


@Setter
@JacksonXmlRootElement(localName = "data")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    private StateMachine stateMachine;

    @JacksonXmlProperty(localName = "Statemachine")
    public StateMachine getStateMachine() {
        return stateMachine;
    }
}
