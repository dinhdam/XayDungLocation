public class LocationTest {
    public static void main(String[] args) {
        double[][] arr = new double[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Math.random() * 100;
            }
        }
        Location largestElement = Location.locateLargest(arr);
        System.out.println("Hàng của phần tử lớn nhất: " + largestElement.row);
        System.out.println("Cột của phần tử lớn nhất: " + largestElement.column);
        System.out.println("Giá trị của phần tử lớn nhất: " + largestElement.maxValue);
    }
}
