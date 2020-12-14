package com.nhandn.shop.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class CartDTO extends AbstractDTO {

    private Long id;
    private UserDTO userId;
    private String sessionId;
    private String token;
    private Long status;
    private String line1;
    private String line2;
    private String city;
    private String province;
    private String country;
    private String content;
    private List<CartItemDTO> cartItems;

    @Override
    public String toString() {
        return "CartDTO{" +
                "id=" + id +
                ", userId=" + userId +
                ", sessionId='" + sessionId + '\'' +
                ", token='" + token + '\'' +
                ", status=" + status +
                ", line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", content='" + content + '\'' +
                ", cartItems=" + cartItems +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
