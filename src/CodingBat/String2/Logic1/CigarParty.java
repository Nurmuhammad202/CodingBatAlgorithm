package CodingBat.String2.Logic1;

public class CigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            // On weekends, no upper limit, just check the lower limit
            return cigars >= 40;
        } else {
            // On weekdays, check if cigars are between 40 and 60 inclusive
            return cigars >= 40 && cigars <= 60;
        }
    }
}
