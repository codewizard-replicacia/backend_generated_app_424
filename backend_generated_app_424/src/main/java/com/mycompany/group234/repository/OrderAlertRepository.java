package com.mycompany.group234.repository;


import com.mycompany.group234.model.OrderAlert;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class OrderAlertRepository extends SimpleJpaRepository<OrderAlert, String> {
    private final EntityManager em;
    public OrderAlertRepository(EntityManager em) {
        super(OrderAlert.class, em);
        this.em = em;
    }
    @Override
    public List<OrderAlert> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"OrderAlert\"", OrderAlert.class).getResultList();
    }
}