package com.nhandn.shop.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ProductDTO extends AbstractDTO {

    private Long id;
    private UserDTO userId;
    private String title;
    private String metaTitle;
    private String slug;
    private String summary;
    private String type;
    private String sku;
    private Float price;
    private Float discount;
    private Float quantity;
    private Long shop;
    private Date publishedAt;
    private Date startsAt;
    private Date endsAt;
    private String content;
    private List<CartItemDTO> cartItems;
    private List<ProductReviewDTO> productReviews;
    private List<ProductMetaDTO> productMetas;
    private List<OrderItemDTO> orderItems;
    private List<CategoryDTO> categories;
    private List<TagDTO> tags;

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", metaTitle='" + metaTitle + '\'' +
                ", slug='" + slug + '\'' +
                ", summary='" + summary + '\'' +
                ", type='" + type + '\'' +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", quantity=" + quantity +
                ", shop=" + shop +
                ", publishedAt=" + publishedAt +
                ", startsAt=" + startsAt +
                ", endsAt=" + endsAt +
                ", content='" + content + '\'' +
                ", cartItems=" + cartItems +
                ", productReviews=" + productReviews +
                ", productMetas=" + productMetas +
                ", orderItems=" + orderItems +
                ", categories=" + categories +
                ", tags=" + tags +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
