package com.foodapp.foodapp.domain.order;

import com.foodapp.foodapp.domain.product.Product;
import com.foodapp.foodapp.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Table(name = "order")
@Entity(name = "order")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @CreatedDate
    private Date created_at;

    @LastModifiedDate
    private Date updated_at;

    private User user;

    private OrderStatus status;

    private Product[] products;

    public Order(OrderDTO order) {
        this.user = order.user();
        this.status = order.status();
        this.products = order.products();
    }
}
