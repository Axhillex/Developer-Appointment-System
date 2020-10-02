public class Developer
{
    String interviewerName;
    String developerName;
    int workingHours;
    String platform;
    //constructor of developer class
    public Developer(String interviewerName, String platform, int workingHours)
    {
        this.interviewerName=interviewerName;
        this.platform=platform;
        this.workingHours=workingHours;
        this.developerName="";
    }
    public String getInterviewerName()
    {
        return interviewerName;
    }
    public String getPlatform()
    {
        return platform;
    }
    public String getDeveloperName()
    {
        return developerName;
    }
    public void setDeveloperName(String developerName)
    {
        this.developerName=developerName;
        System.out.println("Congratulations!!The developer name has been set.");
    }
    public int getWorkingHours()
    {
        return workingHours;
    }
    //to display the details
    public void display()
    {
        System.out.println("The interviewer taken up: "+getInterviewerName());
        System.out.println("The platform's name: "+getPlatform());
        System.out.println("The working hours: "+getWorkingHours());
        if(!developerName.equals("")){
            System.out.println("The developer's name: "+getDeveloperName());
        }
    }
}
