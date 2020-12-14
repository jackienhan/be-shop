package com.nhandn.shop.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "tag")
@Getter
@Setter
public class Tag extends AbstractAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", length = 75, nullable = false)
    private String title;

    @Column(name = "metaTitle", length = 100, nullable = false)
    private String metaTitle;

    @Column(name = "slug", length = 100, nullable = false)
    private String slug;

    @Column(name = "content", nullable = false)
    private String content;

    @ManyToMany(mappedBy = "tags")
    private List<Product> products;

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", metaTitle='" + metaTitle + '\'' +
                ", slug='" + slug + '\'' +
                ", content='" + content + '\'' +
                ", products=" + products +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
