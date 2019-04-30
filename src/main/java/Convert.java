import java.text.DecimalFormat;
import java.util.Scanner;

public class Convert {

    String currency;
    String desiredCurrency;
    double amount;
    double amountUSD;

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public double getAmountUSD() {
        return amountUSD;
    }

    public String getDesiredCurrency() {
        return desiredCurrency;
    }

    public void setDesiredCurrency(String desiredCurrency) {
        this.desiredCurrency = desiredCurrency;
    }

    public void setAmountUSD(double amountUSD) {
        this.amountUSD = amountUSD;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    //DecimalFormat decimalformat = new DecimalFormat("#0.00");

    public void currency(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter currency");
        String currency = in.nextLine();
        setCurrency(currency);
    }

    public void amount(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter currency amount");
        double amount = in.nextDouble();
        setAmount(amount);
    }

    public void newCurrency(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter desired currency");
        String desiredCurrency = in.nextLine();
        setDesiredCurrency(desiredCurrency);

    }

    public void convertToUSD(){
        switch(getCurrency()){
            case "USD":
                setAmountUSD(amount);
                break;
            case "Euro":
                setAmountUSD(amount / 0.94);
                break;
            case "Pound":
                setAmountUSD(amount / 0.82);
                break;
            case "Rupee":
                setAmountUSD(amount / 68.32);
                break;
            case "Aus":
                setAmountUSD(amount / 1.35);
                break;
            case "Can":
                setAmountUSD(amount / 1.32);
                break;
            case "Sing":
                setAmountUSD(amount / 1.43);
                break;
            case "Swiss":
                setAmountUSD(amount / 1.01);
                break;
            case "Ringgit":
                setAmountUSD(amount / 4.47);
                break;
            case "Yen":
                setAmountUSD(amount / 115.84);
                break;
            case "Yuan":
                setAmountUSD(amount / 6.92);
                break;
            default:
                System.out.println("Error");
        }
    }

    public void convertToDesire(){
        switch(getDesiredCurrency()){
            case "USD":
                setAmount(getAmountUSD());
                System.out.println("Amount in USD: " + getAmount());
                break;
            case "Euro":
                setAmount(getAmountUSD() * 0.94);
                System.out.println("Amount in Euro: " + getAmount());
                break;
            case "Pound":
                setAmount(getAmountUSD() * 0.82);
                System.out.println("Amount in Pound: " + getAmount());
                break;
            case "Rupee":
                setAmount(getAmountUSD() * 68.32);
                System.out.println("Amount in Rupee: " + getAmount());
                break;
            case "Aus":
                setAmount(getAmountUSD() * 1.35);
                System.out.println("Amount in Aus: " + getAmount());
                break;
            case "Can":
                setAmount(getAmountUSD() * 1.32);
                System.out.println("Amount in Can: " + getAmount());
                break;
            case "Sing":
                setAmount(getAmountUSD() * 1.43);
                System.out.println("Amount in Sing: " + getAmount());
                break;
            case "Swiss":
                setAmount(getAmountUSD() * 1.01);
                System.out.println("Amount in Swiss: " + getAmount());
                break;
            case "Ringgit":
                setAmount(getAmountUSD() * 4.47);
                System.out.println("Amount in Ringgit: " + getAmount());
                break;
            case "Yen":
                setAmount(getAmountUSD() * 115.84);
                System.out.println("Amount in Yen: " + getAmount());
                break;
            case "Yuan":
                setAmount(getAmountUSD() * 6.92);
                System.out.println("Amount in Yuan: " + getAmount());
                break;
            default:
                System.out.println("Error");
        }
    }

}
