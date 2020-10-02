
public class JuniorDeveloper extends Developer
{
    private String appointedDate;
    private String evaluationPeriod;
    private float salary;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;
    //the constructor of JuniorDeveloper class
    public JuniorDeveloper(String platform, String interviewerName, int workingHours, float salary, String appointedBy, String terminationDate)
    {
        super(interviewerName, platform, workingHours);
        this.salary=salary;
        this.appointedBy=appointedBy;
        this.terminationDate=terminationDate;
        this.appointedDate=" ";
        this.evaluationPeriod=" ";
        this.specialization=" ";
        this.joined=false;
    }
    public String getAppointedDate()
    {
        return appointedDate;
    }
    public String getTerminationDate()
    {
        return terminationDate;
    }
    public String getAppointedBy()
    {
        return appointedBy;
    }
    public String getEvaluationPeriod()
    {
        return evaluationPeriod;
    }
    public String getSpecialization()
    {
        return specialization;
    }
    public boolean getJoined()
    {
        return joined;
    }
    public float getSalary()
    {
        return salary;
    }
    //to set new value for salary for the new developer
    public void setSalary(float salary)
    {   
        if(joined==false){
            this.salary=salary;
            System.out.println("The salary has been set.");
        }
        else{
            System.out.println("This developer is already appointed so the salary can not be changed");
        }
    }
    //to apoint a new developer
    public void appointNewDev(String developerName, String appointedDate, String terminationDate, String specialization, String evaluationPeriod)
    {
        if(joined==false){
            setDeveloperName(developerName);
            this.developerName=developerName;
            this.appointedDate=appointedDate;
            this.terminationDate=terminationDate;
            this.specialization=specialization;
            this.evaluationPeriod=evaluationPeriod;
            joined=true;
            System.out.println("You have successfully appointed a developer.");
        }
        else{
            System.out.println("The developer "+getDeveloperName()+" was already appointed in "+getAppointedDate());
            System.out.println("The contract was terminated in "+getTerminationDate());
            System.out.println("The developer specializes in "+getSpecialization());
        }
    }
    //to display the details of the developer and the interviewer
    public void display()
    {
        super.display();
        if(joined==true){
            System.out.println("The appointed date of the developer is "+getAppointedDate());
            System.out.println("The developer was evaluated during "+getEvaluationPeriod());
            System.out.println("The contract of the developer was terminated in "+getTerminationDate());
            System.out.println("The salary of the developer is "+getSalary());
            System.out.println("The developer specializes in "+getSpecialization());
            System.out.println("The developer was appointed by "+getAppointedBy());
        }
        else
        {
            System.out.println("The developer has not joined yet.");
        }
    }
}

