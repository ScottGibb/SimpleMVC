import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    //Fields for Interfaces
    private IView view;
    private IModel model;


    /**
     * Class SHOULD NOT CONTAIN ACTUAL REFERENCES TO OBJECTS ONLY INTERFACES
     * @param view View Interface
     * @param model Model Interface
     */
    public Controller(IView view, IModel model){
        this.view = view;
        this.model = model;
    }

    @Override
    /**
     * Requires: model != null
     * modifeies: model
     * effects: depending on the action tells model to do stuff
     *
     *
     * ########DECOUPLING ISSUE#######
     * in order to decouple the controller from the view the controller must implement actionPerformed method
     * a set of action command strings are made and are held constant in both controller and view
     * this does slightly couple thing sotirios says thats fine
     *
     *
     */
    public void actionPerformed(ActionEvent e) {
        System.out.println("HERE");
       if( e.getActionCommand().equals("increment")){
           model.inc();
       }
       else if(e.getActionCommand().equals("decrement")){
           model.dec();
       }else if(e.getActionCommand().equals("setCount")){
           model.setCount(Integer.parseInt(view.getInput()));
       }else{
           System.out.println("INVAILD ");
       }
    }
}
