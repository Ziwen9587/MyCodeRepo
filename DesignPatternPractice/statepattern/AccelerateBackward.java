package statepattern;

public class AccelerateBackward implements State{

    public boolean doAction(Context context){
        boolean actionDone = false;

        if ( context.getState().toString().equals("Stop") ){
            System.out.println("pressLeftPedalMoreThanFiveSeconds");
            context.setState(this);
            actionDone = true;
            System.out.println("State Transition Successes!");
            return actionDone;
        } else if ( context.getState().toString().equals("ConstantBackward") ) {
            System.out.println("pressRightPedalOnce");
            context.setState(this);
            actionDone = true;
            System.out.println("State Transition Successes!");
            return actionDone;
        } else if ( context.getState().toString().equals("DecelerateBackward") ) {
            System.out.println("pressRightPedalOnce");
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
        return "AccelerateBackward";
    }

}
