public class Operator implements Employee{
    private static final double FIXED_SALARY = 30000;
    @Override
    public double getMonthSalary() {
        return FIXED_SALARY;
    }
}
