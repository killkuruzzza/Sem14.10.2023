package Fabric;

public class GemGenerator extends ItemFabric{
    @Override
    public IGameItem createItem() {
        System.out.println("Cоздали сундук(изумруд)");
        return new GemReward();
    }
}
