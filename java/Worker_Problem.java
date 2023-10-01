//Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Everyworker has a name and a salary rate. Write method ComPay (int hours) to compute the weekpay of every worker. A Daily Worker is paid based on the number of days he/she works. TheSalaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are.Test this program to calculate the pay of workers. You are expected to use the concept ofpolymorphism to write this program


abstract class Worker{
    String name;
    int rate = 100;

    abstract void CompPay();

}
class Daily_Worker extends Worker{

    int hours;
    Daily_Worker(int h){
        this.hours = h;
    }
    void CompPay(){
        System.out.println("Salary: " + this.hours * rate);
    }

}
class Salary_Worker extends Worker{

    void CompPay(){
        System.out.println("Salary: " + 40 * rate);

}
}




public class Worker_Problem {
    public static void main(String[] args) {

        Daily_Worker d1 = new Daily_Worker(8);
        Salary_Worker d2 = new Salary_Worker();

        d1.CompPay();
        d2.CompPay();
        
    }
    
}
