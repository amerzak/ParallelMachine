package apps.singleMachineProblem;

public class Problem {
        private final int _nbJobs;
        private final java.util.ArrayList<Job> _jobs;/* Jobs to be executed*/
        private final int _timeHorizonLength;

        public Problem(int nbJobs, final java.util.ArrayList<Job> jobs, int timeHorizonLength){
            this._nbJobs = nbJobs;
            this._jobs = jobs;
            this._timeHorizonLength =  timeHorizonLength;
        }

        public final int  getNbJobs(){return _nbJobs;}
        public final Job  getJobPtr(int i)  {return _jobs.get(i);}
        public final int getTimeHorizonLength()  {return _timeHorizonLength;}
        public final java.util.ArrayList<Job> getJobsArray() {return _jobs;}

        @Override
        public String toString() {
            System.out.println("The Problem has "+_nbJobs+" jobs");
            System.out.println("Job    \tp_j\td_j\tw_j");
            _jobs.forEach(System.out::println);//The remaining fields
            System.out.println(" Done -----");
            return "";
        }
}