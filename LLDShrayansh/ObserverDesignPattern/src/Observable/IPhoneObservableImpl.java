package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StocksObservable {
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    public void add(NotificationAlertObserver observer){
        observerList.add(observer);
    }

    public void remove(NotificationAlertObserver observer){
        observerList.remove(observer);
    }

    public void notifySubscribers(){
        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }

    public void setStockCount(int newStockAdded){

        this.stockCount+=newStockAdded;
        if(stockCount-newStockAdded==0) {

            notifySubscribers();
        }

    }

    public int getStockCount(){
        return this.stockCount;
    }


}
