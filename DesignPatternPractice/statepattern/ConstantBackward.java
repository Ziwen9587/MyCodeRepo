package statepattern;

public class ConstantBackward implements State{

    public boolean doAction(Context context){
        boolean actionDone = false;
        System.out.println("pressLeftPedalThrice");

        if ( context.getState().toString().equals("AccelerateBackward") ){
            context.setState(this);
            actionDone = true;
            System.out.println("State Transition Successes!");
            return actionDone;
        } else if ( context.getState().toString().equals("DecelerateBackward") ){
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
        return "ConstantBackward";
    }

}
