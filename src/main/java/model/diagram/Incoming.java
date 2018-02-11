package model.diagram;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JacksonXmlRootElement(localName = "incoming")
public class Incoming {
    private Integer id;

    @JacksonXmlProperty(isAttribute = true)
    public Integer getId() {
        return id;
    }
}
