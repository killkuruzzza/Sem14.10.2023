package Fabric;

public class GoldGenerator extends ItemFabric{
    @Override
    public IGameItem createItem() {
        System.out.println("Создали сундук(золото)");
        return new GoldReward();
    }
}
