package statepattern;

public class DecelerateBackward implements State{

    public boolean doAction(Context context){
        boolean actionDone = false;
        System.out.println("pressLeftPedalTwice");

        if ( context.getState().toString().equals("ConstantBackward") ){
            context.setState(this);
            actionDone = true;
            System.out.println("State Transition Successes!");
            return actionDone;
        } else if ( context.getState().toString().equals("AccelerateBackward") ){
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
        return "DecelerateBackward";
    }

}
