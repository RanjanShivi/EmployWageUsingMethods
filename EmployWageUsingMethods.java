public class EmployWageUsingMethods {
    public static final int full_time=1;

    public static int attendance() {
        int check = (int) Math.floor(Math.random() * 10) % 2;
        return check;
    }
    public static void main(String[] args) {
        int emp_attendance = attendance();
        System.out.println("Employ Attendance Status="+ emp_attendance);

        if((emp_attendance==full_time))
            System.out.println("Employ Present");
        else
            System.out.println("Employ Absent");

    }

}
