package com.nhandn.shop.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "cart_item")
@Getter
@Setter
public class CartItem extends AbstractAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", nullable = false)
    private Product productId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cartId;

    @Column(name = "sku", length = 100, nullable = false)
    private String sku;

    @Column(name = "price", nullable = false)
    private float price;

    @Column(name = "discount", nullable = false)
    private float discount;

    @Column(name = "quantity", length = 6, nullable = false)
    private short quantity;

    @Column(name = "active", length = 1, nullable = false)
    private Boolean active;

    @Column(name = "content", nullable = false)
    private String content;

    @Override
    public String toString() {
        return "CartItem{" +
                "id=" + id +
                ", productId=" + productId +
                ", cartId=" + cartId +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", quantity=" + quantity +
                ", active=" + active +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
