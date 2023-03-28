package studikasuspakson;

public class Employee {
    public String name;
    private int nip;
    public String status;
    public String jobDesk;
    public double salary;
    public int timeHours;
    public double bonus;
    public double potongan;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getNip(){
        return nip;
    }
    
    public void setNip (int nip){
        this.nip = nip;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus (String status){
        this.status = status;
    }
    
    public String getJobDesk(){
        return jobDesk;
    }
    
    public void setJobDesk (String jobDesk){
        this.jobDesk = jobDesk;
    }
    
    public double getSalary (){
        return salary;
    }
    
    public void setSalary (double salary){
        this.salary = salary;
    }
    
    public int getTimeHours (){
        return timeHours;
    }
    
    public void setTimeHours (int timeHours){
        this.timeHours = timeHours;
    }
    
    public double getBonus(){
        return bonus;
    }
    
    public void setBonus (double bonus){
        this.bonus = bonus;
    }
    
    public double getPotongan(){
        return potongan;
    }
    
    public void setPotongan (double potongan){
        this.potongan = potongan;
    }
}