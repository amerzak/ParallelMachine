package apps.algorithmClasses;

import apps.singleMachineProblem.Job;
import apps.singleMachineProblem.Problem;
import apps.singleMachineSolution.Solution;

import java.util.Comparator;

public class AlgorithmHodgsonMoore implements Algorithm {
    @Override
    public Solution solve(Problem problem) {
        // Just testing
        Solution solution = new Solution((int) problem.getNbJobs());
        java.util.ArrayList<Job> jobs = problem.getJobsArray();
        System.out.println("Setting jobs ... ");

        System.out.println("Done !!! ");
        // Sort the jobs based on the dueDate (Ascending)
        java.util.Collections.sort(jobs, new java.util.Comparator<Job>() {
            public int compare(Job a, Job b) {
                return a.getDueDate() - b.getDueDate();
            }
        });
        // ** Using completion time and processing time :
        // - Fill a List of onTimeJobs
        int completionTime = 0;
        java.util.ArrayList<Integer> onTimeJobs;
        java.util.ArrayList<Integer> lateJobs;
        // - Fill a List of lateJobs

        // Create solution
        for (int i = 0; i < problem.getNbJobs(); i++) {
            // - Fill a list of jobs
            solution.setJobStartingTime(problem.getJobPtr(i), i);
        }
        return solution;
    }
}
