package connections;


import business.Proxy;
import entity.model.ElementModel;
import lottery.FactoryLottery;
import lottery.IElementEntity;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        FactoryLottery factoryLottery = Proxy.getFactoryLottery();

//        for(int i = 1;i <= 10 ; i++) {
//            ElementModel elementModel = new ElementModel();
//            elementModel.setName(String.valueOf(i));
//            elementModel.setOperator(4);
//            elementModel.setCreateTime(new Date(System.currentTimeMillis()));
//            if (factoryLottery.createElement(elementModel)) {
//                System.out.println("创建成功  " + elementModel);
//            } else {
//                System.out.println("创建失败  " + elementModel);
//            }
//        }


//        if (factoryLottery.deleteElement(1)) {
//            System.out.println("删除成功  ");
//        } else {
//            System.out.println("删除失败  ");
//        }

//        ElementModel elementModel = new ElementModel();
//        elementModel.setName("猪");
//        elementModel.setOperator(4);
//        elementModel.setId(4);
//
//        if (factoryLottery.modiElement(elementModel)) {
//            System.out.println("修改成功  ");
//        } else {
//            System.out.println("修改失败  ");
//        }

        Set<IElementEntity> allElements = new HashSet<>(factoryLottery.getAllElements());

        System.out.println(allElements);

    }

}
