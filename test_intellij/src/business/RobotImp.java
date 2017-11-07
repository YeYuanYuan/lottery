package business;

import lottery.*;

import java.util.List;

final class RobotImp implements Robot {

    public static Robot getInstance() {
        return null;
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

    @Override
    public boolean createElement(IElementEntity element) {
        return false;
    }

    @Override
    public boolean deleteElement(long elementId) {
        return false;
    }

    @Override
    public boolean modiElement(IElementEntity element) {
        return false;
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

    @Override
    public List<IElementEntity> getAllElements() {
        return null;
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
}
