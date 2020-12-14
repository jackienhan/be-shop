package com.nhandn.shop.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TagDTO extends AbstractDTO {

    private Long id;
    private String title;
    private String metaTitle;
    private String slug;
    private String content;
    private List<ProductDTO> products;

    @Override
    public String toString() {
        return "TagDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", metaTitle='" + metaTitle + '\'' +
                ", slug='" + slug + '\'' +
                ", content='" + content + '\'' +
                ", products=" + products +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
