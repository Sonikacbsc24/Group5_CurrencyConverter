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
    
 
        
        // Get number of target currencies
        System.out.print("\nHow many currencies do you want to convert to? ");
        int numCurrencies = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Get target currencies and perform conversions
        System.out.println("\nEnter the target currencies:");
        String[] targetCurrencies = new String[numCurrencies];
        
        for (int i = 0; i < numCurrencies; i++) {
            System.out.print((i + 1) + ". Enter currency code: ");
            targetCurrencies[i] = scanner.nextLine().toUpperCase();
            
            if (!exchangeRates.containsKey(targetCurrencies[i])) {
                System.out.println("   Warning: " + targetCurrencies[i] + " is not supported. Skipping...");
                targetCurrencies[i] = null;
            }
        }

        // Display conversion results
        System.out.println("\n=== Conversion Results ===");
        System.out.printf("Source: %.2f %s\n\n", amount, sourceCurrency);
        
        for (String targetCurrency : targetCurrencies) {
            if (targetCurrency != null) {
                double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);
                System.out.printf("%.2f %s = %.2f %s\n", 
                    amount, sourceCurrency, convertedAmount, targetCurrency);
            }
        }
        
        scanner.close();
    }
    
