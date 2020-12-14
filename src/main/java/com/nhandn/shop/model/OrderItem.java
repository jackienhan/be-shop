package com.nhandn.shop.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "order_item")
@Getter
@Setter
public class OrderItem extends AbstractAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", nullable = false)
    private Product productId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "orderId", nullable = false)
    private Order orderId;

    @Column(name = "sku", length = 100, nullable = false)
    private String sku;

    @Column(name = "price", nullable = false)
    private Float price;

    @Column(name = "discount", nullable = false)
    private Float discount;

    @Column(name = "quantity", length = 6, nullable = false)
    private Long quantity;

    @Column(name = "content", nullable = false)
    private String content;

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", productId=" + productId +
                ", orderId=" + orderId +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", quantity=" + quantity +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
