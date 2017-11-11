package business;

public class Proxy {

    private Proxy() {
    }

    public static Robot getFactoryLottery(){
        return LotteryWrap.getInstances();
    }

}
