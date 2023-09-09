package Test.repository;


import Test.model.OrderAlert;
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
        return em.createNativeQuery("Select * from \"Test\".\"OrderAlert\"", OrderAlert.class).getResultList();
    }
}