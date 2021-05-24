package apps.singleMachineSolution;

import apps.singleMachineProblem.Job;

public class Solution {
    private final java.util.ArrayList<Integer> _schedule;

    public Solution(int nbJobs) {
        this._schedule = new java.util.ArrayList<Integer>(java.util.Collections.nCopies(nbJobs, -1));
    }

    public void setJobStartingTime(final Job job, Integer startTime)
    {
        _schedule.set(job.getId(), startTime);
    }

    @Override
    public String toString() {
        System.out.println("Printing Solution Starting Time");
        System.out.println("begin ... ");
        //_schedule.forEach(System.out.println(_schedule.toString()));
        for (Integer i : _schedule) {
            System.out.println("Job: " + _schedule.indexOf(i) + " starting time: " + i);
        }
        System.out.println("done ------");
        return "----------------------------------------";
    }
}
