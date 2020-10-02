
public class SeniorDeveloper extends Developer
{
    private String joiningDate;
    private String staffRoomNumber;
    private float salary;
    private int contractPeriod;
    private float advanceSalary;
    private boolean appointed;
    private boolean terminated;
    //the constructor of SeniorDeveloper class
    public SeniorDeveloper(String interviewerName, int contractPeriod, float salary, String platform, int workingHours)
    {
        super(interviewerName, platform, workingHours);
        this.contractPeriod=contractPeriod;
        this.salary=salary;
        joiningDate="";
        staffRoomNumber="";
        advanceSalary=0.0f;
        appointed=false;
        terminated=false;
    }
    public boolean isAppointed()
    {
        return appointed;
    }
    public String getJoiningDate()
    {
        return joiningDate;
    }
    public String getStaffRoomNumber()
    {
        return staffRoomNumber;
    }
    public float getAdvanceSalary()
    {
        return advanceSalary;
    }
    public float getSalary()
    {
        return salary;
    }
    public int getContractPeriod()
    {
        return contractPeriod;
    }
    public boolean isTerminated()
    {
        return terminated;
    } 
    public void setSalary(float salary)
    {
        this.salary=salary;
        System.out.println("The salary has been set.");
    }
    //to set the contract period for the developer
    public void setContractPeriod(int contractPeriod)
    {
        this.contractPeriod=contractPeriod;
        System.out.println("The contract period has been set.");
    }
    //to hirse a new developer and assisgn values to the different attributes
    public void hireDev(String developerName, String joiningDate, float advanceSalary, String staffRoomNumber)
    {
        if (appointed==true){
            System.out.println("Mr/s."+getDeveloperName()+" is already appointed");
            System.out.println("His/Her room number is "+getStaffRoomNumber());
        }
        else{
            setDeveloperName(developerName);
            this.joiningDate=joiningDate;
            this.staffRoomNumber=staffRoomNumber;
            this.advanceSalary=advanceSalary;
            appointed=true;
            terminated=false;
            System.out.println("Congratulations!!You've hired a developer.");
        }
    }
    //to terminate the contract of the developer
    public void termination()
    {
        if(terminated==true){
            System.out.println("Contract for this developer is already terminated");
        }
        else{
            setDeveloperName(" ");
            joiningDate=" ";
            advanceSalary=0.0f;
            appointed=false;
            terminated=true;
            System.out.println("Congratulations!!The contract for this developer has been terminated.");
        }
    }
    //to display the details of the developer from super class method
    public void displayDevInfo()
    {
        System.out.println("The developer's platform is: "+getPlatform());
        System.out.println("The interviewer name is: "+getInterviewerName());
        System.out.println("The salary for the developer is: "+getSalary());
    }
    //to display the developer information and interviewer 
    public void display()
    {
        super.display();
        if(appointed==true){
            System.out.println("The termination status of the developer is: "+isTerminated());
            System.out.println("The join date of the developer is: "+getJoiningDate());
            System.out.println("The advance salary of the developer is: "+getAdvanceSalary());
        }
        else
        {
            System.out.println("The developer has not been appointed.");
        }
    }
}
