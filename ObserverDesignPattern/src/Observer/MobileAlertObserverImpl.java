package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String emailId, StocksObservable observable){
        this.observable = observable;
        this.userName  = emailId;
    }

    public void update(){
        System.out.println("Stock count :: " +observable.getStockCount());
        sendMsgOnMobile(userName,"Product is in stock hurry up!");
    }

    public void sendMsgOnMobile(String userName,String msg){
        System.out.println("Msg sent to user :: "+userName);
    }
}
