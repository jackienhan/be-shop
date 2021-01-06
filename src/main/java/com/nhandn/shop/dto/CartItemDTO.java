package com.nhandn.shop.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
public class CartItemDTO extends AbstractDTO {

    private Long id;
    private ProductDTO productId;
    private CartDTO cartId;
    private String sku;
    private Float price;
    private Float discount;
    private Long quantity;
    private Boolean active;
    private String content;

    @Override
    public String toString() {
        return "CartItemDTO{" +
                "id=" + id +
                ", productId=" + productId +
                ", cartId=" + cartId +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", quantity=" + quantity +
                ", active=" + active +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
