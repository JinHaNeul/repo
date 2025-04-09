/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: Processes ragged 2D arrays of sales data to calculate various statistics and determine holiday bonuses based on highest, lowest, and other values within each column.
 * Due: 04/08/2025
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Jin Ha Neul
*/
public class HolidayBonus {
    private static final int HIGHEST = 5000;
    private static final int LOWEST = 1000;
    private static final int OTHER = 2000;

    public static double[] calculateHolidayBonus(double[][] data) {
    	double[] bonuses = new double[data.length];
        int maxColumns = 0;
        for (double[] row : data) {
            if (row.length > maxColumns) {
                maxColumns = row.length;
            }
        }

        for (int col = 0; col < maxColumns; col++) {
            int highestIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col);
            int lowestIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col);

            for (int row = 0; row < data.length; row++) {
                if (col < data[row].length && data[row][col] > 0) {
                    if (row == highestIndex && row == lowestIndex) {
                        bonuses[row] += HIGHEST;
                    } else if (row == highestIndex) {
                        bonuses[row] += HIGHEST;
                    } else if (row == lowestIndex) {
                        bonuses[row] += LOWEST;
                    } else {
                        bonuses[row] += OTHER;
                    }
                }
            }
        }

        return bonuses;
    }

    public static double calculateTotalHolidayBonus(double[][] data) {
        double total = 0.0;
        double[] bonuses = calculateHolidayBonus(data);
        for (int i = 0; i < bonuses.length; i++) {
            total += bonuses[i];
        }
        return total;
    }
}