package g_enums;

public enum Day {
// Declare constants all letters in uppercase
    MN(1), TS(2), WN(3), TH(4), FR(5), ST(6), SN(7);

    //We need to create constructor and fields
    private final int dayOfWeek; //we won't change it
    Day(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    public int getDayOfWeek() {
        return this.dayOfWeek;
    }
    //That's our enums class, GO TO MAIN
}

