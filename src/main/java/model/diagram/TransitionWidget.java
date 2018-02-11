package model.diagram;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransitionWidget extends Widget {
    private TransitionAttributes attributes;

    public TransitionWidget() {
        super("Transition");
    }
}
