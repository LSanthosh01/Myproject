package Mypackage;

public class Classes 
{
    private int empid;
    private String Empname;
    private double salary;

    public Classes(int empid, String Empname, double salary) 
    {
        this.empid = empid;
        this.Empname = Empname;
        this.salary = salary;
    }

    @Override
    public String toString() 
    {
        return "Empid:"+empid+"\n"+"Empname:"+Empname+"\n"+"Salary:"+salary;
    }

    public void setEmpid(int empid) 
    {
        this.empid=empid;
    }

    public void setEmpname(String Empname) 
    {
        this.Empname=Empname;
    }

    public void setSalary(double salary) 
    {
        this.salary=salary;
    }

    public int getEmpid() 
    {
        return empid;
    }

    public String getEmpname() 
    {
        return Empname;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void calculateBonus() 
    {
        double bonus=0.05*salary;
        System.out.println("Empid:"+getEmpid());
        System.out.println("Empname:"+getEmpname());
        System.out.println("Salary:"+getSalary());
        System.out.println("Bonus:"+bonus);
    }

    public static void main(String[] args) 
    {
        Classes c1=new Classes(110,"Ram",50000);
        Classes c2=new Classes(121,"Sam",40000);
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("-------------------------");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("\n");
        System.out.println("BONUS DETAILS");
        System.out.println("-------------------------");
        c1.calculateBonus();
        c2.calculateBonus();
    }
}
