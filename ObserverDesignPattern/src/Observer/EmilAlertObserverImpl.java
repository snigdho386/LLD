package Observer;

import Observable.StocksObservable;

public class EmilAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    public EmilAlertObserverImpl(String emailId, StocksObservable observable){
        this.observable = observable;
        this.emailId = emailId;
    }

    public void update(){
        sendMail(emailId, "Product is in stock hurry up!");
    }

    public void sendMail(String emailId, String msg){
        System.out.println("Mail sent to : "+emailId);
    }
}
