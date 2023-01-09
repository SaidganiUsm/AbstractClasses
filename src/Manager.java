public class Manager implements Employee{
    public final double FIXED_SALARY = 70000;
    private final double earningsForCompany;

    public Manager() {
        this.earningsForCompany = (int) (Math.random() * 25000) + 115000;
    }
    @Override
    public double getMonthSalary() {
        return FIXED_SALARY + (earningsForCompany * 0.05);
    }
}
