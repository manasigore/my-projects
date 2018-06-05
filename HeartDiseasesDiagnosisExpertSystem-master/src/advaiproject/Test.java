/*
 * Apply test data set to neural network and check result.
 */
package advaiproject;

/**
 *
 * @author Atul Jadhav
 */

public class Test {

	public double[][] calcNetOfHiddenUnits(int number_of_hidden_unit,double wt_bet_input_hidden[][],double normalizeInput[]) {

		int i = 0, k = 0;
		double sum = 0;
                int intputNo=0;  
		double net_of_hidden_units[][] = new double[number_of_hidden_unit][1];
	
                while (i < number_of_hidden_unit) { // for each hidden layer

			sum = 0;
			k = 0; // for input matrix
			for (int j = 0; j < wt_bet_input_hidden.length; j++) {

				sum += wt_bet_input_hidden[j][i] * normalizeInput[j];

			}

			net_of_hidden_units[i][0] = sum;
			// System.out.println(net_of_hidden_units[i][0]);
			i++;
		}
        return net_of_hidden_units;
	}   

	
	public double[][] calcOpWtOfHiddenUnits(int number_of_hidden_unit, double net_of_hidden_units[][]) {

		double opwt_of_hidden_units[][] = new double[number_of_hidden_unit][1];
		// System.out.println("output of hidden units :");
		for (int i = 0; i < number_of_hidden_unit; i++) {

			opwt_of_hidden_units[i][0] = 1 / (1 + Math
					.exp(net_of_hidden_units[i][0] * -1));

			// System.out.println(opwt_of_hidden_units[i][0]);
		}

		return opwt_of_hidden_units;
	}
	
	// calculate net value of output units
	public double[][] calcNetOfOutputUnits(int number_of_output_unit,double opwt_of_hidden_units[][],double wt_bet_hidden_output[][]) {
		int i = 0, k = 0;
		double sum = 0;

		double net_of_output_units[][] = new double[number_of_output_unit][1];
		// System.out.println("net of output unit :");
		while (i < number_of_output_unit) { // for each output layer
			sum = 0;
			k = 0;
			for (int j = 0; j < wt_bet_hidden_output.length; j++) {

				sum += opwt_of_hidden_units[k++][0]
						* wt_bet_hidden_output[j][i];

			}

			net_of_output_units[i][0] = sum;

			// System.out.println(net_of_output_units[i][0]);
			i++;
		}

		return net_of_output_units;
	}

	// calculate Output of output units
	public double[] calcOpWtOfOutputUnits(int number_of_output_unit,double net_of_output_units[][]) {

		double actualOutputs[] = new double[number_of_output_unit];
		// System.out.println("output of o/p unit :");
		for (int i = 0; i < number_of_output_unit; i++) {

			actualOutputs[i] = 1 / (1 + Math
					.exp(net_of_output_units[i][0] * -1));

			
		}

		return actualOutputs;
	}


}
