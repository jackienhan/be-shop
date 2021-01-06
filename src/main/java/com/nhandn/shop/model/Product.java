package com.nhandn.shop.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product extends AbstractAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false)
    private User userId;

    @Column(name = "title", length = 75, nullable = false)
    private String title;

    @Column(name = "metaTitle", length = 100, nullable = false)
    private String metaTitle;

    @Column(name = "slug", length = 100, nullable = false)
    private String slug;

    @Column(name = "summary", nullable = false)
    private String summary;

    @Column(name = "type", length = 6, nullable = false)
    private String type;

    @Column(name = "sku", length = 100, nullable = false)
    private String sku;

    @Column(name = "price", nullable = false)
    private Float price;

    @Column(name = "discount", nullable = false)
    private Float discount;

    @Column(name = "quantity", length = 6, nullable = false)
    private Long quantity;

    @Column(name = "shop", length = 1, nullable = false)
    private Integer shop;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "publishedAt", nullable = false)
    private Date publishedAt;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "startsAt", nullable = false)
    private Date startsAt;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "endsAt", nullable = false)
    private Date endsAt;

    @Column(name = "content", nullable = false)
    private String content;

    @OneToMany(mappedBy = "productId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CartItem> cartItems;

    @OneToMany(mappedBy = "productId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProductReview> productReviews;

    @OneToMany(mappedBy = "productId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProductMeta> productMetas;

    @OneToMany(mappedBy = "productId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItem> orderItems;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "product_category",
            joinColumns = { @JoinColumn(name = "product_id") },
            inverseJoinColumns = { @JoinColumn(name = "category_id") })
    private List<Category> categories;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "product_tag",
            joinColumns = { @JoinColumn(name = "product_id") },
            inverseJoinColumns = { @JoinColumn(name = "tag_id") })
    private List<Tag> tags;

    @Override
    public String toString() {
        return "Product{" +
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
                ", updateAt=" + updateAt +
                '}';
    }
}
