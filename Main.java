import ru.netology.companies.Company;
import ru.netology.companies.Deal;
import ru.netology.companies.Expenditure;
import ru.netology.companies.Sale;
import ru.netology.taxes.TaxSystemIncome;
import ru.netology.taxes.TaxSystemProfit;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Test Company", new TaxSystemIncome());

        // 6% от 100 руб. дохода
        company.shiftMoney(100);
        company.shiftMoney(-50);
        company.payTaxes();

        // 15% от 50 руб. прибыли
        company.shiftMoney(100);
        company.shiftMoney(-50);
        company.setTaxSystem(new TaxSystemProfit());
        company.payTaxes();

        // нет прибыли
        company.shiftMoney(100);
        company.shiftMoney(-200);
        company.payTaxes();

        System.out.printf("applyDeals вернула %d\n", company.applyDeals(new Deal[]{
                new Expenditure("бипки", 10),
                new Sale("бипки", 100),
                new Sale("бипки", 100),
                new Expenditure("RTX5090", 200000),
                new Sale("RTX5090", 300000)}
        ));
    }
}
