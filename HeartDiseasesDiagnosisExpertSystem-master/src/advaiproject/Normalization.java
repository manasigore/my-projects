/* To applay min-max normalization on training and test data to get all attribute values between 0 and 1 
 *
 */
package advaiproject;

/**
 *
 * @author Atul Jadhav
 */

public class Normalization extends ReadFiles {

	double[][] normalizeInput;
	double[][] normalizeTestInput;

	
	public Normalization(int hidden_units) {
		super(hidden_units);
		
		normalizeInput = new double[number_of_training_input][number_of_input_unit];
		normalizeTestInput = new double[number_of_test_input][number_of_input_unit];


	}

	public double[][] normalization( double input[][], int no_of_input) {

		  double normalizeData[][] = new double[no_of_input][number_of_input_unit];
		
		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input[i].length; j++) {

				switch (j) {

				// max Age 77
				case 0:
					
					normalizeData[i][j] = input[i][j] / (double) 77;

					break;

				// sex
				case 1:
					normalizeData[i][j] = input[i][j] / 1;

					break;

				// Chest Pain Type
				case 2:
					normalizeData[i][j] = input[i][j] / 4;
					break;

				// Resting Blood Pressure
				case 3:
					normalizeData[i][j] = input[i][j] / 200;
					break;

				// Serum Cholesterol max value 564
				case 4:
					normalizeData[i][j] = input[i][j] / 564;

					break;

				// Fasting blood sugar max value 1
				case 5:
					normalizeData[i][j] = input[i][j] / 1;

					break;

				// Resting Electrocardiographic result max value 2
				case 6:
					normalizeData[i][j] = input[i][j] / 2;

					break;

				// Maximum Heart Rate Achieved max value 202
				case 7:
					normalizeData[i][j] = input[i][j] / 202;

					break;

				// Exercise Induced Angina max value 1
				case 8:
					normalizeData[i][j] = input[i][j] / 1;
					break;

				// Old Peak max value 6.2
				case 9:
					normalizeData[i][j] = input[i][j] / 6.2;

					break;

				// The Slope of the Peak Exercise ST Segment max value 3
				case 10:
					normalizeData[i][j] = input[i][j] / 3;

					break;

				// Number of Major Vessels max value 3
				case 11:
					normalizeData[i][j] = input[i][j] / 3;
					break;

				// Thal; fixed defect; reversible defect max value 7
				case 12:
					normalizeData[i][j] = input[i][j] / 7;
					break;

				}
			}

		}
		
		   
        return normalizeData;
	}

	
}
