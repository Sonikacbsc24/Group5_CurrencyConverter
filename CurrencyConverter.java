import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    
    // Exchange rates relative to USD
    private static final Map<String, Double> exchangeRates = new HashMap<>();
    
    // Currency names
    private static final Map<String, String> currencyNames = new HashMap<>();
    
    static {
        // Initialize exchange rates (base: USD)
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.86);
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("INR", 88.24);
        exchangeRates.put("JPY", 152.74);
        exchangeRates.put("AUD", 1.53);
        exchangeRates.put("CAD", 1.40);
        exchangeRates.put("CHF", 0.80);
        exchangeRates.put("CNY", 7.12);
        exchangeRates.put("AED", 3.67);
        
        // Initialize currency names
        currencyNames.put("USD", "US Dollar");
        currencyNames.put("EUR", "Euro");
        currencyNames.put("GBP", "British Pound");
        currencyNames.put("INR", "Indian Rupee");
        currencyNames.put("JPY", "Japanese Yen");
        currencyNames.put("AUD", "Australian Dollar");
        currencyNames.put("CAD", "Canadian Dollar");
        currencyNames.put("CHF", "Swiss Franc");
        currencyNames.put("CNY", "Chinese Yuan");
        currencyNames.put("AED", "UAE Dirham");
    }
