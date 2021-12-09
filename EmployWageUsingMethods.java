public class EmployWageUsingMethods {
    public static final int part_time=1;
    public static final int full_time=2;
    public static final int emp_rate=20;
    public static final int work_day=20;
    public static final int max_hrs=100;

    public static int attendance() {
        int check = (int) Math.floor(Math.random() * 10) % 3;
        return check;
    }

    public static int calEmpHours( int attend_status) {
        int emp_hrs;
        switch (attend_status) {
            case 1:
                emp_hrs = 4;
                break;
            case 2:
                emp_hrs = 8;
                break;
            default:
                emp_hrs = 0;
        }
        return emp_hrs;
    }

    public static void main(String[] args) {
        int emp_attendance=0, emp_hoursPerDay=0, tot_emp_hours=0, day=0, emp_wage=0, tot_emp_wage=0;

        while(tot_emp_hours < max_hrs && day < work_day)
        {
            emp_attendance = attendance();
            System.out.println("Employ Attendance Status=" + emp_attendance);

            emp_hoursPerDay = calEmpHours(emp_attendance);
            System.out.println("Day:" + day + " Employ hour per day= " + emp_hoursPerDay );

            day++;
            tot_emp_hours += emp_hoursPerDay;
            emp_wage = emp_hoursPerDay * emp_rate;
            System.out.println("Employ wage per day = " + emp_wage);
            tot_emp_wage +=emp_wage;


        }
        System.out.println("total work day= " + day + " total work hours= " + tot_emp_hours);
        System.out.println("Total Employ wage= " + tot_emp_wage);
    }
}





