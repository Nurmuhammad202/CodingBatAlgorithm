package CodingBat.String2.Logic1;

public class AsnwerCall {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        // If you're asleep, do not answer
        if (isAsleep) {
            return false;
        }
        // If it's morning, only answer if it's your mom
        return !isMorning || isMom;
        // Otherwise, answer
    }
}
