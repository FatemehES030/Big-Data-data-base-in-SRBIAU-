

class Employee{
    float salary=52000000;
}
class Programmer extends Employee{
    int bonus=6000000;
    public static void main(String args[]){
        Programmer p=new Programmer();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}
