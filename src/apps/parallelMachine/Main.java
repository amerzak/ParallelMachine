package apps.parallelMachine;

import apps.algorithmClasses.AlgorithmHodgsonMoore;
import apps.singleMachineProblem.Problem;
import apps.singleMachineProblem.ReadData;
import apps.singleMachineSolution.Solution;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	    // write your code here
        System.out.println("Parallel Machine \nStarting ... ");

        // Read data file
        ReadData rdata = new ReadData();
        Problem pOne = rdata.readFile("data/wt040/wt040_011.dat");
        pOne.toString();

        Solution solution = new Solution(pOne.getNbJobs());

        AlgorithmHodgsonMoore algo = new AlgorithmHodgsonMoore();
        solution = algo.solve(pOne);
        pOne.toString();
        // pas facile
    }
}
