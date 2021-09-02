package statepattern;

public class ConstantForward implements State{

    public boolean doAction(Context context){
        boolean actionDone = false;
        System.out.println("pressRightPedalMoreThanFiveSeconds");

        if ( context.getState().toString().equals("AccelerateForward") ){
            context.setState(this);
            actionDone = true;
            System.out.println("State Transition Successes!");
            return actionDone;
        } else if ( context.getState().toString().equals("DecelerateForward") ){
            context.setState(this);
            actionDone = true;
            System.out.println("State Transition Successes!");
            return actionDone;
        } else {
            System.out.println("State Transition Failed");
            return actionDone;
        }
    }

    public String toString(){
        return "ConstantForward";
    }

}
