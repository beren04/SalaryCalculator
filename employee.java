package employee;

public class employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    employee(String name, double salary,int workHours,int hireYear){
        this.name= name;
        this.salary= salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(){
        double tax = 0;
        if(salary>=1000){
            tax = salary*0.03;
        }
        return tax;
    }

    public int bonus(){
        int bonus = 0;
        if(workHours>40){
             bonus = (workHours-40)*30;
        }
        return bonus;
    }

    public double raiseSalary(){
        double raise=0;
        if(2021-hireYear<20){
            raise = salary*0.1;
        }
        if(2021-hireYear<10){
            raise=salary*0.05;
        }
        if(2021-hireYear>19){
            raise=salary*0.15;
        }
        return raise;
    }
    public String toString() {
        return
                "Name:"+ name +
                        "\nSalary:"+salary +
                        "\nWork hours:"+workHours +
                        "\nJob starting year:"+hireYear +
                        "\nTax:"+tax() +
                        "\nBonus:"+bonus() +
                        "\nSalary raise:"+raiseSalary() +
                        "\nSalary with tax and bonus:"+(salary-tax()+bonus()) +
                        "\nTotal Salary:"+(salary+raiseSalary());
    }
}
