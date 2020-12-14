package com.nhandn.shop.dto;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class ProductReviewDTO extends AbstractDTO {
    private Long id;
    private ProductDTO productId;
    private String title;
    private Long rating;
    private Long published;
    private Date publishedAt;
    private String content;

    @Override
    public String toString() {
        return "ProductReviewDTO{" +
                "id=" + id +
                ", productId=" + productId +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                ", published=" + published +
                ", publishedAt=" + publishedAt +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
