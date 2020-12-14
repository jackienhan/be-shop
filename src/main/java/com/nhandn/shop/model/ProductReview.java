package com.nhandn.shop.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "product_review")
@Getter
@Setter
public class ProductReview extends AbstractAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", nullable = false)
    private Product productId;

    @Column(name = "title", length = 100, nullable = false)
    private String title;

    @Column(name = "rating", length = 6, nullable = false)
    private Long rating;

    @Column(name = "published", length = 1, nullable = false)
    private Long published;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "publishedAt", nullable = false)
    private Date publishedAt;

    @Column(name = "content", nullable = false)
    private String content;

    @Override
    public String toString() {
        return "ProductReview{" +
                "id=" + id +
                ", productId=" + productId +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                ", published=" + published +
                ", publishedAt=" + publishedAt +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
