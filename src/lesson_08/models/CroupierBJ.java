package lesson_08.models;

public class CroupierBJ extends PlayerImpl {

    public CroupierBJ() {}

    public CroupierBJ(String name){
        this.name = name;
    }

    @Override
    public boolean isCroupier() {
        return true;
    }

    @Override
    public boolean needCard() {
        return countValuesOfAllCardsOnHand() <= 17;
    }

}
