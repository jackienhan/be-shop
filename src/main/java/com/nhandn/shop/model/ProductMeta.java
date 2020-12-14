package com.nhandn.shop.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "product_meta")
@Getter
@Setter
public class ProductMeta extends AbstractAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", nullable = false)
    private Product productId;

    @Column(name = "key", length = 50, nullable = false)
    private String key;

    @Column(name = "content", nullable = false)
    private String content;

    @Override
    public String toString() {
        return "ProductMeta{" +
                "id=" + id +
                ", productId=" + productId +
                ", key='" + key + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
