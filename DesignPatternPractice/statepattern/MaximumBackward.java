package statepattern;

public class MaximumBackward implements State{

    public boolean doAction(Context context){
        boolean actionDone = false;
        System.out.println("noActionMoreThanTenSeconds");

        if ( context.getState().toString().equals("AccelerateBackward") ){
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
        return "MaximumBackward";
    }

}
