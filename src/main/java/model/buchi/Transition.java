package model.buchi;

import model.ltl.Formula;


public class Transition {
    private final Formula<String> expression;
    private final String stateName;

    public Transition(Formula<String> expression, String stateName) {
        this.expression = expression;
        this.stateName = stateName;
    }

    public Formula<String> getExpression() {
        return expression;
    }

    public String getStateName() {
        return stateName;
    }
}
