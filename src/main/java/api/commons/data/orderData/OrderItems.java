package api.commons.data.orderData;

public class OrderItems {
    private int productId;
    private int quantity;

    public OrderItems(){
    }

    public OrderItems(int productId, int quantity){
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
