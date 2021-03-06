package model.diagram;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@Getter
@Setter
@XmlRootElement(name = "attributes")
public class StateAttributes extends Attributes {
    private String name;
    private Integer type;
    private List<Incoming> incomings;
    private List<Outgoing> outgoings;

    @JacksonXmlProperty(localName = "incoming")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<Incoming> getIncomings() {
        return incomings;
    }

    @JacksonXmlProperty(localName = "outgoing")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<Outgoing> getOutgoings() {
        return outgoings;
    }
}
