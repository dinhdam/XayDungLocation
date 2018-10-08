public class Location {
    int row;
    int column;
    double maxValue;

    public Location() {

    }

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] arr) {
        double max = arr[0][0];
        int maxRow = 0;
        int maxColumn = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        Location location = new Location(maxRow, maxColumn, max);
        return location;
    }

}
