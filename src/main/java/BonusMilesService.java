public class BonusMilesService {
    public int calculate (int cost) {
        int amountForMile = 20;
        int bonusMiles = cost / amountForMile;
        return bonusMiles;
    }
}
