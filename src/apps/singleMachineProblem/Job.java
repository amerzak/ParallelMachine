package apps.singleMachineProblem;

public class Job {
    private final int _iD;              // identifier of the job
    private final int _processingTime;  // time need it to execute the job
    private final int _dueDate;         // due date of the job
    private final int _weight;          // weight associated with the job

    public Job(int iD, int processingTime, int dueDate, int weight){
        this._iD = iD;
        this._processingTime = processingTime;
        this._dueDate = dueDate;
        this._weight = weight;
    }

    public int getId() {
        return _iD;
    }
    public int getProcessingTime() {
        return _processingTime;
    }
    public int getDueDate() {
        return _dueDate;
    }
    public int getWeight() {
        return _weight;
    }

    // try to override compareTo
    @Override
    public String toString() {
        return "Job_"+_iD + " \t" + _processingTime + "\t" + _dueDate + "\t" + _weight  ;
    }
}
