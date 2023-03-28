
public class Employee {
    private String name;
    private String id;
    private int basicSalary;

    public Employee(String name, String id, int basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public int getHra() {
        return (int) (basicSalary * 0.3);
    }

    public int getDa() {
        return (int) (basicSalary * 0.2);
    }

    public int getTa() {
        return (int) (basicSalary * 0.1);
    }

    public int getTax() {
        return (int) (basicSalary * 0.05);
    }

    public int getPf() {
        return (int) (basicSalary * 0.05);
    }

    public int getGrossSalary() {
        return basicSalary + getHra() + getDa() + getTa();
    }

    public int getNetSalary() {
        return getGrossSalary() - getTax() - getPf();
    }
}
