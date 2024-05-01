package problemset;
import java.text.DecimalFormat;

public class sales {
    // Function to get the commission rate based on sales
    public static double getCommissionRate(double salesAmount) {
        if (salesAmount >= 0.01 && salesAmount <= 5000) {
            return 0.08;
        } else if (salesAmount > 5000 && salesAmount <= 10000) {
            return 0.10;
        } else if (salesAmount > 10000) {
            return 0.12;
        } else {
            return 0.00;
        }
    }

    public static void main(String[] args) {
        double baseSalary = 5000;
        double targetIncome = 30000;
        double sales = 0;
        double step = 0.01;
        double income = 0;
        double commission = 0;

        while (income < targetIncome) {
            sales += step;
            commission = sales * getCommissionRate(sales);
            income = baseSalary + commission;
        }

        DecimalFormat df = new DecimalFormat("#.##");
        sales = Double.parseDouble(df.format(sales));

        System.out.println("The minimum sales amount to make $30,000 is $" + sales);
    }
}
