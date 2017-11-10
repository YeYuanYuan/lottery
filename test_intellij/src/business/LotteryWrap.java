package business;

import lottery.*;

import java.util.List;

final class LotteryWrap implements Robot {

    private static Robot robot;

    static {
        robot = new LotteryWrap(RobotBusiness.getInstance());
    }

    private Robot base;

    public static Robot getInstances() {
        return robot;
    }

    private LotteryWrap(Robot base) {
        this.base = base;
    }

    @Override
    public boolean modiGroup(IGroupEntity groupEntity) {
        return base.modiGroup(groupEntity);
    }

    @Override
    public boolean createGroup(IGroupEntity groupEntity) {
        return base.createGroup(groupEntity);
    }

    @Override
    public boolean deleteGroup(long groupId) {
        return base.deleteGroup(groupId);
    }

    @Override
    public boolean createElement(IElementEntity element) {
        return base.createElement(element);
    }

    @Override
    public boolean deleteElement(long elementId) {
        return base.deleteElement(elementId);
    }

    @Override
    public boolean modiElement(IElementEntity element) {
        return base.modiElement(element);
    }

    @Override
    public long[] elementRelationGroup(long[] elementId, long groupId) {
        return base.elementRelationGroup(elementId, groupId);
    }

    @Override
    public long[] deleteByElementByGroup(long[] elementId, long groupId) {
        return base.deleteByElementByGroup(elementId, groupId);
    }

    @Override
    public List<IGroupEntity> getAllGroups() {
        return base.getAllGroups();
    }

    @Override
    public List<IElementEntity> getAllElements() {
        return base.getAllElements();
    }

    @Override
    public List<IElementEntity> getElementsByGroup(long groupId) {
        return base.getElementsByGroup(groupId);
    }

    @Override
    public List<IGroupEntity> getElementJoinGroup(long elementId) {
        return base.getElementJoinGroup(elementId);
    }

    @Override
    public String login(String user, String pwd) {
        return base.login(user, pwd);
    }

    @Override
    public IPersonEntity getPersonInfo(long user, String key) {
        return base.getPersonInfo(user, key);
    }

    @Override
    public ICycleEntity getNewCycle() {
        return base.getNewCycle();
    }

    @Override
    public List<ICycleEntity> getCycles(long top, long end) {
        return base.getCycles(top, end);
    }

    @Override
    public boolean createOdds(IOddsEntity iOddsEntity) {
        return base.createOdds(iOddsEntity);
    }

    @Override
    public boolean modiOdds(IOddsEntity iOddsEntity) {
        return base.modiOdds(iOddsEntity);
    }

    @Override
    public boolean deleteOdds(long iOddsId) {
        return base.deleteOdds(iOddsId);
    }

    @Override
    public boolean order(IBuyGroupEntity iBuyGroup) {
        return base.order(iBuyGroup);
    }


    @Override
    public void createPerson(IPersonEntity iPersonEntity) {
        base.createPerson(iPersonEntity);
    }

    @Override
    public void deletePerson(long id) {
        base.deletePerson(id);
    }

    @Override
    public void modiPerson(IPersonEntity iPersonEntity) {
        base.modiPerson(iPersonEntity);
    }
}
