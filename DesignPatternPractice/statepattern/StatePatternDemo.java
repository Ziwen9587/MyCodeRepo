package statepattern;

public class StatePatternDemo {
    public static void main(String[] args){
        Context context = new Context();

        AccelerateForward ac = new AccelerateForward();
        ac.doAction(context);
        System.out.println(context.getState());
        if(context.getState().toString().equals("AccelerateForward")){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        DecelerateForward df  = new DecelerateForward();
        df.doAction(context);

    }
}
