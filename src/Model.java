import java.io.ObjectStreamException;
import java.util.Observable;
import java.util.Observer;

public class Model extends Observable implements IModel {


    private int count;

    /**
     * Requires: start != null
     * modifies: this
     * effects: sets the initial value of count
     *
     */
    public Model(int start){
        count= start;
    }

    /**
     * modifies: this
     * effects: increments count and notifys the observers that things have chnaged
     */
    @Override
    public void inc() {
        count++;
        System.out.println("Count is"+ count);
        setChanged();//set the observaable object ie the model to changed
        notifyObservers();//notify all the observers
    }

    /**
     * Modifies: this
     * effetcs: decrements the count and notifies hte observs that things have changed
     */
    @Override
    public void dec() {
        count--;
        System.out.println("Count is"+ count);
        setChanged();//set the observaable object ie the model to changed
        notifyObservers();//notify all the observers
    }

    /**
     *
     * effects: returns the current count
     */
    @Override
    public int getCount() {
        return count;

    }

    /**
     * requires: count != null
     * Modifies: this
     * effects: sets the current count to count and notifys the observers that its changed
     */
    @Override
    public void setCount(int count) {
        this.count = count;
        System.out.println("Count is"+ count);
        setChanged();
        notifyObservers();
    }

    @Override
        public void addObserver(Observer o) {
            super.addObserver(o);

        }
}
