public class PurchaseCalculator {

    //Se crean los métodos

    public double calculateSubtotal (double price, int quantity) {
        return price * quantity;
    }//calculateSubtotal

    public boolean isValidPurchase(double price, int quantity) {
        return price > 0 && quantity > 0;
    }//isValidPurchases

    public double calculateDiscount(double subtotal) {
        if (subtotal >= 1000.0) {
            return subtotal * 0.10;
        }//if
        return 0;
    }//calculateDiscount

    public double calculateFinalPrice(double subtotal) {
        return subtotal - calculateDiscount(subtotal);
    }//calculateFinalPrice



}//class purchaseCalculator
