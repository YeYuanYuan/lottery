package business;

import access.AccessElement;
import com.microsoft.sqlserver.jdbc.StringUtils;
import entity.model.ElementModel;
import lottery.*;

import java.util.ArrayList;
import java.util.List;

final class RobotBusiness implements Robot {

    private RobotBusiness() {
    }

    public static Robot getInstance() {
        return new RobotBusiness();
    }

    @Override
    public boolean modiGroup(IGroupEntity groupEntity) {
        return false;
    }

    @Override
    public boolean createGroup(IGroupEntity groupEntity) {
        return false;
    }

    @Override
    public boolean deleteGroup(long groupId) {
        return false;
    }
    //实现
    @Override
    public boolean createElement(IElementEntity element) {
        boolean nullFlag = StringUtils.isEmpty(element.getName()) || element.getOperator() < 0;
        if (nullFlag) {
            System.out.println("名字或操作人不能为空");
            return false;
        } else {
            return AccessElement.insertSql((ElementModel) element) > 0;
        }
    }
    //实现
    @Override
    public boolean deleteElement(long elementId) {
        if (elementId < 0) {
            System.out.println("id 不能为空");
            return false;
        } else {
            return AccessElement.deleteSql(elementId) > 0;
        }
    }
    //实现
    @Override
    public boolean modiElement(IElementEntity element) {
        boolean nullFlag = StringUtils.isEmpty(element.getName()) || element.getOperator() < 0;
        if (nullFlag) {
            System.out.println("名字或操作人不能为空");
            return false;
        } else {
            return AccessElement.upDateSql((ElementModel) element) > 0;
        }
    }

    @Override
    public long[] elementRelationGroup(long[] elementId, long groupId) {
        return new long[0];
    }

    @Override
    public long[] deleteByElementByGroup(long[] elementId, long groupId) {
        return new long[0];
    }

    @Override
    public List<IGroupEntity> getAllGroups() {
        return null;
    }
    //实现
    @Override
    public List<IElementEntity> getAllElements() {
        return new ArrayList<>(AccessElement.query(null,null,false,null,-1));
    }

    @Override
    public List<IElementEntity> getElementsByGroup(long groupId) {
        return null;
    }

    @Override
    public List<IGroupEntity> getElementJoinGroup(long elementId) {
        return null;
    }

    @Override
    public String login(String user, String pwd) {
        return null;
    }

    @Override
    public IPersonEntity getPersonInfo(long user, String key) {
        return null;
    }

    @Override
    public ICycleEntity getNewCycle() {
        return null;
    }

    @Override
    public List<ICycleEntity> getCycles(long top, long end) {
        return null;
    }

    @Override
    public boolean createOdds(IOddsEntity iOddsEntity) {
        return false;
    }

    @Override
    public boolean modiOdds(IOddsEntity iOddsEntity) {
        return false;
    }

    @Override
    public boolean deleteOdds(long iOddsId) {
        return false;
    }

    @Override
    public boolean order(IBuyGroupEntity iBuyGroup) {
        return false;
    }


    @Override
    public void createPerson(IPersonEntity iPersonEntity) {

    }

    @Override
    public void deletePerson(long id) {

    }

    @Override
    public void modiPerson(IPersonEntity iPersonEntity) {

    }
}
