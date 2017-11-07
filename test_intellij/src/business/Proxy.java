package business;

public class Proxy {

    public Robot getFactoryLottery(){
        return LotteryWrap.getInstances();
    }

}
