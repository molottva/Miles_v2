public class BonusMilesService {

    public int calculate(int cost) {
        int milePerCost = 20;

        int miles = cost / milePerCost;
        return miles;
    }
}
