/*
    - read data from file
    - store each line as a Job (total Jobs is a Problem)
*/
package apps.singleMachineProblem;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadData {
    public Problem readFile(String filePath) throws FileNotFoundException {
        System.out.println("Reading data from file ...");
        ArrayList<Job> jobs = new ArrayList<>();
        Scanner fileIn = new Scanner(new File(filePath));
        int processingTime, dueDate, weight;
        int nbJobs = fileIn.nextInt();
        int timeHorizon=0;
        int id=0;
        do {
            processingTime = fileIn.nextInt();
            timeHorizon+=processingTime;
            dueDate = fileIn.nextInt();
            weight = fileIn.nextInt();

            Job job = new Job(id, processingTime, dueDate, weight);
            jobs.add(job);
            id++;
        } while (fileIn.hasNextInt());
        fileIn.close();
        Problem problem = new Problem(nbJobs, jobs, timeHorizon);
        System.out.println("Done ----- ");
        // must return a problem
        return problem;
    }
}