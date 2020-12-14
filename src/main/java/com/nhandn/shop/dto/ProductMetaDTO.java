package com.nhandn.shop.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class ProductMetaDTO extends AbstractDTO {

    private Long id;
    private ProductDTO productId;
    private String key;
    private String content;

    @Override
    public String toString() {
        return "ProductMetaDTO{" +
                "id=" + id +
                ", productId=" + productId +
                ", key='" + key + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
