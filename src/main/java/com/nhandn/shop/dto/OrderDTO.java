package com.nhandn.shop.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class OrderDTO extends AbstractDTO {

    private Long id;
    private UserDTO userId;
    private String sessionId;
    private String token;
    private Long status;
    private Float subTotal;
    private Float itemDiscount;
    private Float tax;
    private Float shipping;
    private Float total;
    private String promo;
    private Float discount;
    private Float grandTotal;
    private String line1;
    private String line2;
    private String city;
    private String province;
    private String country;
    private String content;
    private List<TransactionDTO> transactions;
    private List<OrderItemDTO> orderItems;

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", userId=" + userId +
                ", sessionId='" + sessionId + '\'' +
                ", token='" + token + '\'' +
                ", status=" + status +
                ", subTotal=" + subTotal +
                ", itemDiscount=" + itemDiscount +
                ", tax=" + tax +
                ", shipping=" + shipping +
                ", total=" + total +
                ", promo='" + promo + '\'' +
                ", discount=" + discount +
                ", grandTotal=" + grandTotal +
                ", line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", content='" + content + '\'' +
                ", transactions=" + transactions +
                ", orderItems=" + orderItems +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
