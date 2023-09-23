package Mypackage;

public class Sampleclass {
    private int empid;
    private String ename;
    private String location;

    public Sampleclass() 
    {
        empid=1;
        ename="rajesh";
        location="delhi";
    }

    public Sampleclass(int r, String n, String l) 
    {
        empid=r;
        ename=n;
        location=l;
    }

    public String toString() 
    {
        return "Empid1:"+empid+"\n"+"Ename: "+ename + "\n"+"Location: "+location;
    }

    public static void main(String[] args) {
        Sampleclass s = new Sampleclass();
        System.out.println("Empid:"+s.empid);
        System.out.println("Ename:"+s.ename);
        System.out.println("Location:"+s.location);
        Sampleclass s1 = new Sampleclass(2, "mohan", "Bangalore");
        System.out.println(s1);
    }
}

