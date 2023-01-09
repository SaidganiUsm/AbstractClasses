public class TopManager implements Employee{
    public final double FIXED_SALARY = 150000;
    @Override
    public double getMonthSalary() {
        return FIXED_SALARY + (Company.getIncome() >= 10000000 ? (int) (FIXED_SALARY * 1.5) : 0);
    }
}
