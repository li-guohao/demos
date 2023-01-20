package cn.liguohao.demo.dp.state;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/10/3 16:36
 */
public class Context {

    Map<String,State>  states;

    State currentState ;

    public Context() {
        states = new HashMap();
        states.put(ConcreteStateDefaut.class.getName(),new ConcreteStateDefaut(this));
        currentState = states.get(ConcreteStateDefaut.class.getName());
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public Map<String, State> getStates() {
        return states;
    }

    public void setStates(Map<String, State> states) {
        this.states = states;
    }

    /**
     *  request can change currentState
     */
    public void request(){
        // Defaut -> A -> B -> Deafult
        currentState.handle();
    }

    @Override
    public String toString() {
        return "Context{" +
                "states=" + states +
                ", currentState=" + currentState +
                '}';
    }
}
