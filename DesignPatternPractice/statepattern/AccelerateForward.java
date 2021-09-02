package statepattern;

public class AccelerateForward implements State{

    public boolean doAction(Context context){
        boolean actionDone = false;
        System.out.println("pressLeftPedalOnce");

        if ( context.getState().toString().equals("Stop") ){
            context.setState(this);
            actionDone = true;
            System.out.println("State Transition Successes!");
            return actionDone;
        } else if ( context.getState().toString().equals("ConstantForward") ){
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
        return "AccelerateForward";
    }
}
