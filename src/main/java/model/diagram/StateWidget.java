package model.diagram;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class StateWidget extends Widget {
    private StateAttributes attributes;

    public StateWidget() {
        super("State");
    }
}
