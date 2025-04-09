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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	public static double[][] readFile(File file) throws FileNotFoundException{
		Scanner fileScanner = new Scanner(file);
		ArrayList<double[]> rows = new ArrayList<>();
		while (fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine().trim();
			if (!line.isEmpty()) {
				String[] tokens = line.split("\\s+");
				double[] row = new double[tokens.length];
				for (int i = 0; i < tokens.length; i++) {
					row[i] = Double.parseDouble(tokens[i]);
				}
				rows.add(row);
			}
		}
		fileScanner.close();
		return rows.toArray(new double[rows.size()][]);
	}
	
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException{
		PrintWriter fileWriter = new PrintWriter(outputFile);
		for (int r = 0; r < data.length; r++) {
			double row[] = data[r];
			for (int i = 0; i < row.length; i++) {
	            fileWriter.print(row[i]);
	            if (i < row.length - 1) {
	                fileWriter.print(" ");
	            }
			}
			fileWriter.println();
		}
		fileWriter.close();
	}
	
	public static double getTotal(double[][] data) {
		double sum = 0;
		for (int r = 0; r < data.length; r++) {
			for (int c = 0; c < data[r].length; c++) {
				sum += data[r][c];
			}
		}
		return sum;
	}
	
	public static double getAverage(double[][] data) {
		int elements = 0;
		for (int r = 0; r < data.length; r++) {
			for (int c = 0; c < data[r].length; c++) {
				elements++;
			}
		}
		return getTotal(data)/elements;
	}
	
	public static double getRowTotal(double[][] data, int row) {
		double total = 0.0;
		for (int i = 0; i < data[row].length; i++) {
			total += data[row][i];
		}
		return total;
	}
	
	public static double getColumnTotal(double[][] data, int col) {
		double total = 0.0;
		for (int r = 0; r < data.length; r++) {
			if (col < data[r].length) {
				total += data[r][col];
			}
		}
		return total;
	}
	
	public static double getHighestInRow(double[][] data, int row) {
		double highestRowVal = data[row][0];
		for (int c = 1; c < data[row].length; c++) {
			if (data[row][c] > highestRowVal) {
				highestRowVal = data[row][c];
			}
		}
		return highestRowVal;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row) {
		int highestRowValIndex = 0;
		for (int c = 0; c < data[row].length; c++) {
			if (data[row][c] == getHighestInRow(data,row)) {
				highestRowValIndex = c;
			}
		}
		return highestRowValIndex;
	}
	
	public static double getLowestInRow(double[][] data, int row) {
		double lowestRowVal = data[row][0];
		for (int c = 1; c < data[row].length; c++) {
			if (data[row][c] < lowestRowVal) {
				lowestRowVal = data[row][c];
			}
		}
		return lowestRowVal;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row) {
		int lowestRowValIndex = 0;
		for (int c = 0; c < data[row].length; c++) {
			if (data[row][c] == getLowestInRow(data,row)) {
				lowestRowValIndex = c;
			}
		}
		return lowestRowValIndex;
	}
	
	public static double getHighestInColumn(double[][] data, int col) {
	    Double highestColVal = null;
	    for (int r = 0; r < data.length; r++) {
	        if (col < data[r].length) {
	        	if (highestColVal == null || data[r][col] > highestColVal) {
	                highestColVal = data[r][col];
	            }
	        }
	    }
	    return highestColVal;
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col) {
	    double highestVal = getHighestInColumn(data, col);
	    for (int r = 0; r < data.length; r++) {
	        if (col < data[r].length && data[r][col] == highestVal) {
	            return r;
	        }
	    }
	    return -1;
	}

	public static double getLowestInColumn(double[][] data, int col) {
	    Double lowestColVal = null;
	    for (int r = 0; r < data.length; r++) {
	        if (col < data[r].length) {
	        	if (lowestColVal == null || data[r][col] < lowestColVal) {
	                lowestColVal = data[r][col];
	            }
	        }
	    }
	    return lowestColVal;
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col) {
	    double lowestVal = getLowestInColumn(data, col);
	    for (int r = 0; r < data.length; r++) {
	        if (col < data[r].length && data[r][col] == lowestVal) {
	            return r;
	        }
	    }
	    return -1;
	}
	
	public static double getHighestInArray(double[][] data) {
		double highestVal = data[0][0];
		for (int r = 0; r < data.length; r++) {
			for (int c = 0; c < data[r].length; c++) {
				if (highestVal < data[r][c]) {
					highestVal = data[r][c];
				}
			}
		}
		return highestVal;
	}
	
	public static double getLowestInArray(double[][] data) {
		double lowestVal = data[0][0];
		for (int r = 0; r < data.length; r++) {
			for (int c = 0; c < data[r].length; c++) {
				if (lowestVal > data[r][c]) {
					lowestVal = data[r][c];
				}
			}
		}
		return lowestVal;
	}
}
