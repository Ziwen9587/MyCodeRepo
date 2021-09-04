public class LunarRoverMovement {

    public enum State{
        STOP,
        ACCELERATE_FORWARD, CONSTANT_FORWARD,DECELERATE_FORWARD,
        ACCELERATE_BACKWARD,CONSTANT_BACKWARD,DECELERATE_BACKWARD,
        MAXIMUM_FORWARD,MAXIMUM_BACKWARD;
    };
    private State roverState;

    public LunarRoverMovement(){
        roverState = State.STOP;
    }

    public boolean pressLeftPedalOnce(){
        boolean evenDone = false;
        State currentState = this.roverState;

        System.out.println("Current State is: " + currentState.toString());
        switch (currentState){
            case STOP:
                setRoverState(State.ACCELERATE_FORWARD);
                System.out.println("From STOP to ACCELERATE_FORWARD");
                evenDone = true;
                break;
            case CONSTANT_FORWARD:
                setRoverState(State.ACCELERATE_FORWARD);
                System.out.println("From CONSTANT_FORWARD to ACCELERATE_FORWARD");
                evenDone = true;
                break;
            case DECELERATE_FORWARD:
                setRoverState(State.ACCELERATE_FORWARD);
                System.out.println("From DECELERATE_FORWARD to ACCELERATE_FORWARD");
                evenDone = true;
                break;
            default:
                break;
        }
        return evenDone;
    }

    public boolean pressRightPedalTwice(){
        boolean evenDone = false;
        State currentState = this.roverState;

        System.out.println("Current State is: " + currentState.toString());
        switch (currentState){
            case ACCELERATE_FORWARD:
                setRoverState(State.DECELERATE_FORWARD);
                System.out.println("From ACCELERATE_FORWARD to DECELERATE_FORWARD");
                evenDone = true;
                break;
            case CONSTANT_FORWARD:
                setRoverState(State.DECELERATE_FORWARD);
                System.out.println("From CONSTANT_FORWARD to DECELERATE_FORWARD");
                evenDone = true;
                break;
            default:
                break;
        }
        return evenDone;
    }

    public boolean pressRightPedalMoreThanFiveSeconds(){
        boolean evenDone = false;
        State currentState = this.roverState;

        System.out.println("Current State is: " + currentState.toString());
        switch (currentState){
            case ACCELERATE_FORWARD:
                setRoverState(State.CONSTANT_FORWARD);
                System.out.println("From ACCELERATE_FORWARD to CONSTANT_FORWARD");
                evenDone = true;
                break;
            case DECELERATE_FORWARD:
                setRoverState(State.CONSTANT_FORWARD);
                System.out.println("From DECELERATE_FORWARD to CONSTANT_FORWARD");
                evenDone = true;
                break;
            default:
                break;
        }
        return evenDone;
    }

    public boolean pressLeftPedalMoreThanFiveSeconds(){
        boolean evenDone = false;
        State currentState = this.roverState;

        System.out.println("Current State is: " + currentState.toString());
        switch (currentState){
            case STOP:
                setRoverState(State.ACCELERATE_BACKWARD);
                System.out.println("From STOP to ACCELERATE_BACKWARD");
                evenDone = true;
                break;
            default:
                break;
        }
        return evenDone;
    }

    public boolean pressLeftPedalThrice(){
        boolean evenDone = false;
        State currentState = this.roverState;

        System.out.println("Current State is: " + currentState.toString());
        switch (currentState){
            case ACCELERATE_BACKWARD:
                setRoverState(State.CONSTANT_BACKWARD);
                System.out.println("From ACCELERATE_BACKWARD to CONSTANT_BACKWARD");
                evenDone = true;
                break;
            case DECELERATE_BACKWARD:
                setRoverState(State.CONSTANT_BACKWARD);
                System.out.println("From DECELERATE_BACKWARD to CONSTANT_BACKWARD");
                evenDone = true;
                break;
            default:
                break;
        }
        return evenDone;
    }

    public boolean pressLeftPedalTwice(){
        boolean evenDone = false;
        State currentState = this.roverState;

        System.out.println("Current State is: " + currentState.toString());
        switch (currentState){
            case CONSTANT_BACKWARD:
                setRoverState(State.DECELERATE_BACKWARD);
                System.out.println("From CONSTANT_BACKWARD to DECELERATE_BACKWARD");
                evenDone = true;
                break;
            case ACCELERATE_BACKWARD:
                setRoverState(State.DECELERATE_BACKWARD);
                System.out.println("From ACCELERATE_BACKWARD to DECELERATE_BACKWARD");
                evenDone = true;
                break;
            default:
                break;
        }
        return evenDone;
    }

    public boolean pressRightPedalOnce(){
        boolean evenDone = false;
        State currentState = this.roverState;

        System.out.println("Current State is: " + currentState.toString());
        switch (currentState){
            case CONSTANT_BACKWARD:
                setRoverState(State.ACCELERATE_BACKWARD);
                System.out.println("From CONSTANT_BACKWARD to ACCELERATE_BACKWARD");
                evenDone = true;
                break;
            case DECELERATE_BACKWARD:
                setRoverState(State.ACCELERATE_BACKWARD);
                System.out.println("From DECELERATE_BACKWARD to ACCELERATE_BACKWARD");
                evenDone = true;
                break;
            default:
                break;
        }
        return evenDone;
    }

    public boolean noActionMoreThanTenSeconds(){
        boolean evenDone = false;
        State currentState = this.roverState;

        System.out.println("Current State is: " + currentState.toString());
        switch (currentState){
            case DECELERATE_FORWARD:
                setRoverState(State.STOP);
                System.out.println("From DECELERATE_FORWARD to STOP");
                evenDone = true;
                break;
            case DECELERATE_BACKWARD:
                setRoverState(State.STOP);
                System.out.println("From DECELERATE_BACKWARD to STOP");
                evenDone = true;
                break;
            case ACCELERATE_FORWARD:
                setRoverState(State.MAXIMUM_FORWARD);
                System.out.println("From ACCELERATE_FORWARD to MAXIMUM_FORWARD");
                evenDone = true;
                break;
            case ACCELERATE_BACKWARD:
                setRoverState(State.MAXIMUM_BACKWARD);
                System.out.println("From ACCELERATE_BACKWARD to MAXIMUM_BACKWARD");
                evenDone = true;
                break;
            default:
                break;
        }
        return evenDone;
    }


    public void setRoverState(State state){
        roverState = state;
    }

    public String getRoverState(){
        String roverStateString = roverState.toString();
        return roverStateString;
    }
}
