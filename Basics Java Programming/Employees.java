class Employee{
    protected String name;
    protected int salary;
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
}

class Manager extends Employee{
    private String section_name;
    public void setSection(String section_name){
        this.section_name = section_name;
    }
    public String getSection(){
        return section_name;
    }
}

class Supervisor extends Employee{
    private int group_id;
    public void setGroupID(int group_id){
        this.group_id = group_id;
    }
    public int getGroupID(){
        return group_id;
    }
}
class Employees {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("Kranti Bahadur");
        m.setSalary(100000);
        m.setSection("Finance");
        
        System.out.println("Manager:");
        System.out.println("Name:" + m.getName());
        System.out.println("Salary:" + m.getSalary());
        System.out.println("Section Name:" + m.getSection());
        
        Supervisor s = new Supervisor();
        s.setName("Ramesh Thapa");
        s.setSalary(75000);
        s.setGroupID(12);

        System.out.println("\nSupervisor:");
        System.out.println("Name: " + s.getName());
        System.out.println("Salary: " + s.getSalary());
        System.out.println("Group ID: " + s.getGroupID());
    }
}
  