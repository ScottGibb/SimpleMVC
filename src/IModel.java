
import java.util.Observer;

public interface IModel {
    /**
     * Interface for model
     */



    void inc();
    void dec();
    int getCount();
    void setCount(int count);
    void addObserver(Observer o);

}
