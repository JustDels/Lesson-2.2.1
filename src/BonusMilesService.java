public class BonusMilesService {
    public int calculate(int price) {
        int rate = 20;
        int bonus = price / rate;
        return bonus;
    }
}