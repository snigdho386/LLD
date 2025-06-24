import Observable.IPhoneObservableImpl;
import Observable.StocksObservable;
import Observer.EmilAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StocksObservable iPhoneStockObservable = new IPhoneObservableImpl();

        NotificationAlertObserver observer1 = new EmilAlertObserverImpl("xyz@gmail.com", iPhoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("abc@gmail.com", iPhoneStockObservable);

        iPhoneStockObservable.add(observer1);
        iPhoneStockObservable.add(observer2);

        iPhoneStockObservable.setStockCount(10);

    }
}