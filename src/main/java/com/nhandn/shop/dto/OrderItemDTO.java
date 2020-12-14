package com.nhandn.shop.dto;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class OrderItemDTO extends AbstractDTO {

    private Long id;
    private ProductDTO productId;
    private OrderDTO orderId;
    private String sku;
    private Float price;
    private Float discount;
    private Long quantity;
    private String content;

    @Override
    public String toString() {
        return "OrderItemDTO{" +
                "id=" + id +
                ", productId=" + productId +
                ", orderId=" + orderId +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", quantity=" + quantity +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
