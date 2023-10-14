package Fabric;

public class GoldReward implements IGameItem{
    @Override
    public void open() {
        System.out.println("Открыли сундку с золотом");
    }
}
