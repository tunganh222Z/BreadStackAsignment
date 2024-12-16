package api.commons.data.orderData;

import java.util.List;

public class OrderData {
    private int userId;
    private List<OrderItems> items;

    public OrderData(){}
    public OrderData(int userId, List<OrderItems> items){
        this.userId = userId;
        this.items = items;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<OrderItems> getItems() {
        return items;
    }

    public void setItems(List<OrderItems> items) {
        this.items = items;
    }
}
