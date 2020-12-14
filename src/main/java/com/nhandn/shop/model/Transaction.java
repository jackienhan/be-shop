package com.nhandn.shop.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "transaction")
@Getter
@Setter
public class Transaction extends AbstractAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false)
    private User userId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId", nullable = false)
    private Order orderId;

    @Column(name = "code", length = 100, nullable = false)
    private String code;

    @Column(name = "type", length = 6, nullable = false)
    private Long type;

    @Column(name = "mode", length = 6, nullable = false)
    private Long mode;

    @Column(name = "status", length = 6, nullable = false)
    private Long status;

    @Column(name = "content", nullable = false)
    private String content;

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", userId=" + userId +
                ", orderId=" + orderId +
                ", code='" + code + '\'' +
                ", type=" + type +
                ", mode=" + mode +
                ", status=" + status +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
