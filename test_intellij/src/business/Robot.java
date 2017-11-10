package business;

import entity.model.PersonModel;
import lottery.FactoryLottery;
import lottery.IPersonEntity;

public interface Robot extends FactoryLottery {


    void createPerson(IPersonEntity iPersonEntity);

    void deletePerson(long id);

    void modiPerson(IPersonEntity iPersonEntity);

}
