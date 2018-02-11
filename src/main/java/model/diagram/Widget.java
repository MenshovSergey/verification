package model.diagram;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Widget {
    private Integer id;
    private String type;
    private Attributes attributes;

    public Widget(String type) {
        this.type = type;
    }

    @JacksonXmlProperty(isAttribute = true)
    public Integer getId() {
        return id;
    }
}
