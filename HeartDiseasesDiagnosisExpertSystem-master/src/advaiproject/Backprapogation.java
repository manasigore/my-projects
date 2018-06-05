/*  Implementation of backprapogation algorithm 
 *
 */
package advaiproject;

/**
 *
 * @author Atul Jadhav
 */
import java.util.Random;
import java.util.Scanner;

public class Backprapogation extends Normalization {

	final double learning_coeff = 0.4f;
	final int randomWeightMultiplier = 1;

	double wt_bet_input_hidden[][];

	double net_of_hidden_units[][];
	double opwt_of_hidden_units[][];
	double delta_of_hidden_units[][];
	double wt_bet_hidden_output[][];

	int  trainingDataMultiClasstTargetOutput[][];
	int testingDataMultiClasstTargetOutput[][];

	double updated_wt_bet_hidden_output[][];

	double net_of_output_units[][];
	double opwt_of_output_units[][];
	double actualOutputs[][];
	double delta_of_output_units[][];
	double updatedwt_bet_hidden_output[][];

	double error = 0;

	public Backprapogation(int hidden_units) {

		super(hidden_units);
	}

	// to randomly initialize input weights
	public void initializeWeight() {

		trainingDataMultiClasstTargetOutput = new int[number_of_training_input][number_of_output_unit];
		testingDataMultiClasstTargetOutput = new int[number_of_test_input][number_of_output_unit];
				
		wt_bet_input_hidden = new double[number_of_input_unit][number_of_hidden_unit];
		wt_bet_hidden_output = new double[number_of_hidden_unit][number_of_output_unit];

		updatedwt_bet_hidden_output = new double[number_of_hidden_unit][number_of_output_unit];

		net_of_hidden_units = new double[number_of_hidden_unit][1];
		opwt_of_hidden_units = new double[number_of_hidden_unit][1];
		delta_of_hidden_units = new double[number_of_hidden_unit][1];

		net_of_output_units = new double[number_of_output_unit][1];
		opwt_of_output_units = new double[number_of_output_unit][1];
		actualOutputs = new double[number_of_training_input][number_of_output_unit];
		delta_of_output_units = new double[number_of_output_unit][1];

		// System.out.println("\nInitial input Weights: ");

		for (int i = 0; i < wt_bet_input_hidden.length; i++) {

			for (int j = 0; j < wt_bet_input_hidden[i].length; j++) {

				wt_bet_input_hidden[i][j] = getRandom();

			}
		}
		// System.out.println("\nHiidden input Weights:");
		for (int i = 0; i < wt_bet_hidden_output.length; i++) {

			for (int j = 0; j < wt_bet_hidden_output[i].length; j++) {

				wt_bet_hidden_output[i][j] = getRandom();
			}
		}

		for (int i = 0; i < number_of_training_input; i++) {
			for (int j = 0; j < number_of_output_unit; j++) {

				trainingDataMultiClasstTargetOutput[i][j] = 0;
			}
		}
	}

	// to get random value
	public double getRandom() {

		Random rand = new Random();

		return randomWeightMultiplier * (rand.nextDouble() * 2 - 1); // [-1;1]

	}

        // de define multiclass target output 
	public int[][] defineMultiClassTarget(int output[][], int no_of_input) {

		 int multiClassOutput [][]  = new int[no_of_input][number_of_output_unit];

 		for (int i = 0; i < output.length; i++) {

			switch (output[i][0]) {

			case 0:
				multiClassOutput[i][0] = 1;
				break;

			case 1:
				multiClassOutput[i][1] = 1;
				break;

			case 2:
				multiClassOutput[i][2] = 1;
				break;

			case 3:
				multiClassOutput[i][3] = 1;
				break;

			case 4:
				multiClassOutput[i][4] = 1;
				break;

			}

		}
 		
 		
      return multiClassOutput;
	}

	// calculate net of hidden units
	public void calcNetOfHiddenUnits(int intputNo) {

		int k, i = 0;
		double sum = 0;

		while (i < number_of_hidden_unit) { // for each hidden layer

			sum = 0;
			k = 0; // for input matrix
			for (int j = 0; j < wt_bet_input_hidden.length; j++) {

				sum += wt_bet_input_hidden[j][i] * normalizeInput[intputNo][j];

			}

			net_of_hidden_units[i][0] = sum;

			i++;
		}

	}

	// calculate Output of Hidden units
	public void calcOpWtOfHiddenUnits() {

		// System.out.println("output of hidden units :");
		for (int i = 0; i < number_of_hidden_unit; i++) {

			opwt_of_hidden_units[i][0] = 1 / (1 + Math
					.exp(net_of_hidden_units[i][0] * -1));

		}

	}

	// calculate net value of output units
	public void calcNetOfOutputUnits() {
		int i = 0, k = 0;
		double sum = 0;

		while (i < number_of_output_unit) { // for each output layer
			sum = 0;
			k = 0;
			for (int j = 0; j < wt_bet_hidden_output.length; j++) {

				sum += opwt_of_hidden_units[k++][0]
						* wt_bet_hidden_output[j][i];

			}

			net_of_output_units[i][0] = sum;

			i++;
		}

	}

	// calculate Output of output units
	public void calcOpWtOfOutputUnits(int inputNo) {

		// System.out.println("output of o/p unit :");
		for (int i = 0; i < number_of_output_unit; i++) {

			opwt_of_output_units[i][0] = 1 / (1 + Math
					.exp(net_of_output_units[i][0] * -1));

			actualOutputs[inputNo][i] = opwt_of_output_units[i][0];

		}

	}

        // to calculate mean square error 
	public void calcMeanSqureUnit(int iter) {

		error = 0;
		for (int i = 0; i < number_of_training_input; i++) {
			for (int j = 0; j < number_of_output_unit; j++) {

				double err = Math.pow(
						(trainingDataMultiClasstTargetOutput[i][j] - actualOutputs[i][j]),
						2);

				error += err;

			}

		}

		error = error / (2 * number_of_training_input);
		System.out.println("iteration : " + iter + " Error : " + error);

	}

	// calculate delta value of output units
	public void calcDeltaofOutputUnits(int inputNo) {

		// System.out.println("delta of output unit:");
		for (int i = 0; i < number_of_output_unit; i++) {

			delta_of_output_units[i][0] = (trainingDataMultiClasstTargetOutput[inputNo][i] - opwt_of_output_units[i][0])
					* (opwt_of_output_units[i][0])
					* (1 - opwt_of_output_units[i][0]);
		}

	}

	// calculate updated weight value of hidden input
	public void calcUpdatedwt1() {

		for (int i = 0; i < wt_bet_hidden_output.length; i++) {

			for (int j = 0; j < wt_bet_hidden_output[i].length; j++) {

				updatedwt_bet_hidden_output[i][j] = wt_bet_hidden_output[i][j]
						+ (learning_coeff * delta_of_output_units[j][0] * opwt_of_hidden_units[i][0]);

			}
		}

	}

	// calculate delta value of hidden units
	public void calcDeltaOfHiddenUnit() {

		double temp;

		// System.out.println("delta of hidden unit : ");
		for (int i = 0; i < number_of_hidden_unit; i++) {

			temp = 0;

			for (int j = 0; j < wt_bet_hidden_output[i].length; j++) {

				temp += (wt_bet_hidden_output[i][j] * delta_of_output_units[j][0]);

			}

			delta_of_hidden_units[i][0] = temp * opwt_of_hidden_units[i][0]
					* (1 - opwt_of_hidden_units[i][0]);

			// System.out.println(delta_of_hidden_units[i][0]);
		}

	}

	// calculate updated weight value of input input
	public void calcUpdatedwt2(int intputNo) {

		// System.out.println("updated wt 2 : ");

		for (int i = 0; i < wt_bet_input_hidden.length; i++) {

			for (int j = 0; j < wt_bet_input_hidden[i].length; j++) {

				wt_bet_input_hidden[i][j] = wt_bet_input_hidden[i][j]
						+ (learning_coeff * delta_of_hidden_units[j][0] * normalizeInput[intputNo][i]);

			}

		}

	}

	// to copy updated hidden input weight
	public void copyUpdatedwt_bet_hidden_output() {

		for (int i = 0; i < wt_bet_hidden_output.length; i++) {

			for (int j = 0; j < wt_bet_hidden_output[i].length; j++) {

				wt_bet_hidden_output[i][j] = updatedwt_bet_hidden_output[i][j];
			}
		}

	}


         // to get heart diease type 
	public String getDieaseType(int type) {

		String DieaseType = "";
		
		switch (type) {

		case 0:
				DieaseType = "Healthy";
				break;
		case 1:
				DieaseType = "Sick-1";
				break;
		case 2:
				DieaseType = "Sick-2";
				break;
		case 3:
				DieaseType = "Sick-3";
				break;
		case 4:
				DieaseType = "Serious";
				break;

		}

		return DieaseType;
	}

        // traning data set statistics 
	public double trainingOutput(){

		int achieve = 0;
		System.out.println("\nTraining set output: \n");

		for (int i = 0; i < actualOutputs.length; i++) {

			System.out.println();
			for (int j = 0; j < trainingDataMultiClasstTargetOutput[i].length; j++) {

				System.out.printf("%d ",
						(int) trainingDataMultiClasstTargetOutput[i][j]);

			}

			System.out.print(" || ");
			for (int j = 0; j < actualOutputs[i].length; j++) {

				System.out.printf("%.5f ", actualOutputs[i][j]);

			}
			if (actualOutputs[i][targetOutput[i][0]] >= 0.9) {

				System.out.print("  *");
				System.out.print(getDieaseType(targetOutput[i][0]));
				achieve++;
			} 

			System.out.println();
		}
	
                double trainigDataAccuracy = ((double) achieve / number_of_training_input) * 100.0;
		
                System.out.println("\n\nTrainig data set accuracy :" +trainigDataAccuracy + " %");
		
                return trainigDataAccuracy;
	}

        public static void main(String args[]) {

		int hidden_units;
		int maxRuns;
                double trainigDataAccuracy;
                
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of hidden unit ");
		hidden_units = sc.nextInt();

		System.out.println("Enter number of iteration ");
		maxRuns = sc.nextInt();

		Backprapogation bpa = new Backprapogation(hidden_units);

		bpa.initializeWeight();
		bpa.readTestFile();
		
		bpa.normalizeInput = bpa.normalization(bpa.input,
				bpa.number_of_training_input);
		
		bpa.normalizeTestInput = bpa.normalization(bpa.testData,
				bpa.number_of_test_input);
		
                
		bpa.trainingDataMultiClasstTargetOutput = bpa.defineMultiClassTarget(bpa.targetOutput,bpa.number_of_training_input);
                bpa.testingDataMultiClasstTargetOutput  = bpa.defineMultiClassTarget(bpa.testDataTargetOutput,bpa.number_of_test_input);

                
                
                int count = 0;

		int inputNo = 0;

		while (count < maxRuns) {

			for (int i = 0; i < bpa.number_of_training_input; i++) {

				inputNo = i;

				bpa.calcNetOfHiddenUnits(inputNo);
				bpa.calcOpWtOfHiddenUnits();
				bpa.calcNetOfOutputUnits();

				bpa.calcOpWtOfOutputUnits(inputNo);

				bpa.calcDeltaofOutputUnits(inputNo);

				bpa.calcUpdatedwt1();

				bpa.calcDeltaOfHiddenUnit();

				bpa.calcUpdatedwt2(inputNo);

				bpa.copyUpdatedwt_bet_hidden_output();

			}

			if (((count + 1) % 500) == 0)
				bpa.calcMeanSqureUnit(count + 1);

			count++;

		}

		
		trainigDataAccuracy = bpa.trainingOutput();
		System.out.println("\n\n\nTesting Data output ....");

		int testAchived = 0;

               	 double actualOutputs[][] = new double[bpa.number_of_test_input][bpa.number_of_output_unit];
		 String dieaseType[][] = new String[bpa.number_of_test_input][1];
                 
		for (int i = 0; i < bpa.number_of_test_input; i++) {

			double testInput[] = bpa.normalizeTestInput[i];
			double net_of_hidden_units[][] = new double[bpa.number_of_hidden_unit][1];

			Test t = new Test();

			net_of_hidden_units = t.calcNetOfHiddenUnits(
					bpa.number_of_hidden_unit, bpa.wt_bet_input_hidden,
					testInput);
		
			double opwt_of_hidden_units[][] = new double[bpa.number_of_hidden_unit][1];
			
			opwt_of_hidden_units = t.calcOpWtOfHiddenUnits(
					bpa.number_of_hidden_unit, net_of_hidden_units);

			double net_of_output_units[][] = new double[bpa.number_of_output_unit][1];
			
			net_of_output_units = t.calcNetOfOutputUnits(
					bpa.number_of_output_unit, opwt_of_hidden_units,
					bpa.wt_bet_hidden_output);
			
			actualOutputs[i] = t.calcOpWtOfOutputUnits(bpa.number_of_output_unit,
					net_of_output_units);

			System.out.print(bpa.testDataTargetOutput[i][0] + " || ");
		
                        for (int j = 0; j < actualOutputs[i].length; j++) {
		
				System.out.printf("%.5f ", actualOutputs[i][j]);

			}
			if (actualOutputs[i][(int) bpa.testDataTargetOutput[i][0]] >= 0.9) {

				testAchived++;

				System.out.print(" *");

				System.out.print(bpa
						.getDieaseType((int) bpa.testDataTargetOutput[i][0]));

                                dieaseType[i][0] = bpa.getDieaseType((int) bpa.testDataTargetOutput[i][0]);
			}else{
                            
                                dieaseType[i][0] = "Fail Case";
                        }

			System.out.println(" ");
		}


                double testDataAccuracy = (((double) testAchived / bpa.number_of_test_input) * 100.0);
		System.out.println("\n\nTesting data set accuracy "+ testDataAccuracy +"%");
		
               
                
                StartGUI sg = new StartGUI(bpa,hidden_units,maxRuns,trainigDataAccuracy,testDataAccuracy,actualOutputs,dieaseType);
               
                  sg.setVisible(true);
                  sg.display();
                  
		sc.close();
	}

}
