//pay slip for employee
class PayCalculation
{
    String name;
    byte emp_c;
    int emp_n;
    double bp, hra, ha, da, pf, gross_salary, net_salary;
      
    void inputData(String n, byte empc, int empn, double b)
    {
      name=n;
      emp_c=empc;
      emp_n=empn;
      bp=b;
    }
    
    void calcPay()
    {
        da=bp*45.0 /100;
        
        if(emp_c==1)
        {
            hra = 2500;
            ha = 2.5 / 100 *bp;
        }
        
        else if (emp_c==2)
        {
            hra=2000;
            ha= 3.0 /100 *bp;
        }
        
        else if (emp_c==3)
        {
            hra = 1500;
            ha = 3.5 / 100 *bp;
        }
        
        else
        {
            System.out.println( "Wrong employ code");
        }
        
        pf= (bp + da) * 10.0 /100;
        if (pf > 2500)
        {
            pf=2500;
        }
        
        gross_salary= bp + hra + da + ha;
        net_salary = gross_salary - pf;
    }
        
    void displayPaySlip()
    {
        System.out.println( "Name: " + name + "\t" + "Employee number: " + emp_n);
        System.out.println( "Employee: " + emp_c);
        System.out.println( "Basic Pay: " + bp);
        System.out.println( "DA: " + da);
        System.out.println( "HRA: " + hra);
        System.out.println( "HA: " + ha);
        System.out.println( "PF :" + pf);
        System.out.println( "Gross salary: " + gross_salary);
        System.out.println( "Net Salary: " + net_salary);
    }
}

        