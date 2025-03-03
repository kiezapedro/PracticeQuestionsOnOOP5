package Assignment;

public class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable table1, SingleTable table2) {
        this.table1 = table1;
        this.table2 = table2;
    }

    public int getNumSeats() {
        return table1.getNumSeats() + table2.getNumSeats() - 2;
    }

    public boolean canSeat(int numPeople) {
        return numPeople <= getNumSeats();
    }

    public double getDesirability() {
        double averageViewQuality = (table1.getViewQuality() + table2.getViewQuality()) / 2;
        if (table1.getHeight() == table2.getHeight()) {
            return averageViewQuality;
        } else {
            return averageViewQuality - 10;
        }
    }
}
