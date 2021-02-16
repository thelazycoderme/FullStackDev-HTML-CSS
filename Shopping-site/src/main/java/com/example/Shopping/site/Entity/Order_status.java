package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Order_status {
    @Id
    //foreign key
    private long order_product_id;
    private enum from_status
    {
     ORDER_PLACED,CANCELLED,ORDER_REJECTED,ORDER_CONFIRMED,ORDER_SHIPPED,
        DELIVERED,RETURN_REQUESTED,RETURN_REJECTED,RETURN_APPROVED,PICK_UP_INITIATED,
        PICK_UP_COMPLETED,REFUND_INITIATED,REFUND_COMPLETED;
    }
    private enum to_status
    {
        CANCELLED,
        ORDER_CONFIRMED,
                ORDER_REJECTED,
        REFUND_INITIATED,
                CLOSED,
                ORDER_SHIPPED,
        DELIVERED,
                RETURN_REQUESTED,
                RETURN_REJECTED,
        RETURN_APPROVED,
        PICK_UP_INITIATED,
                PICK_UP_COMPLETED,
                REFUND_COMPLETED,
        }
        private String TRANSITION_NOTES_COMMENTS;
}
