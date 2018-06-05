/* TO read from data from trainig and test file
*
*/
package advaiproject;

/**
 *
 * @author Atul Jadhav 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {

	int number_of_training_input;
	int number_of_test_input;

	int number_of_input_unit;
	int number_of_hidden_unit;
	int number_of_output_unit;

	double input[][];
	int targetOutput[][];

	double testData[][];
	int testDataTargetOutput[][];

	public ReadFiles(int hidden_units) {

		number_of_training_input = 273;
		number_of_test_input = 30;
		number_of_input_unit = 13;
		number_of_hidden_unit = hidden_units;
		number_of_output_unit = 5;

		input = new double[number_of_training_input][number_of_input_unit];
		targetOutput = new int[number_of_training_input][1];

		testData = new double[number_of_test_input][number_of_input_unit];
		testDataTargetOutput = new int[number_of_test_input][1];

	}

	public void readTestFile() {

		try {
//			BufferedReader in = new BufferedReader(new FileReader(
//					"C:/Users/Admin/Desktop/AI Project/clevelandData.txt"));
                        
                        BufferedReader in = new BufferedReader(new FileReader(
					"C:\\Users\\Admin\\Documents\\NetBeansProjects\\AdvAIProject\\src\\clevelandData.txt"));

			String str;

			str = in.readLine();

			String commdelim[] = str.split(",");

			int i = 0;

			do {

				commdelim = str.split(",");

				for (int j = 0; j < number_of_input_unit; j++) {

					if (commdelim[j].contains("?")) {
						input[i][j] = 0;
					} else {
						input[i][j] = Double.parseDouble(commdelim[j]);
					}

				}

				targetOutput[i][0] = Integer.parseInt(commdelim[13]);

				i++;

			} while ((str = in.readLine()) != null);

			in.close();

		} catch (IOException e) {

			System.out.println("File Read Error");
		}

		try {

//			BufferedReader in = new BufferedReader(new FileReader(
//					"C:/Users/Admin/Desktop/AI Project/clevelandTestData.txt"));

                        BufferedReader in = new BufferedReader(new FileReader(
					"C:\\Users\\Admin\\Documents\\NetBeansProjects\\AdvAIProject\\src\\clevelandTestData.txt"));

			String str;

			str = in.readLine();

			String commdelim[] = str.split(",");

			int i = 0;

			do {

				commdelim = str.split(",");

				for (int j = 0; j < number_of_input_unit; j++) {

					if (commdelim[j].contains("?")) {
						testData[i][j] = 0;
					} else {
						testData[i][j] = Double.parseDouble(commdelim[j]);
					}

				}

				testDataTargetOutput[i][0] = Integer.parseInt(commdelim[13]);

				i++;

			} while ((str = in.readLine()) != null);

			in.close();

		} catch (IOException e) {

			System.out.println("File Read Error");
		}

	}

}
