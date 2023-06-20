package com.sphere.Asius.Repository;

import com.sphere.Asius.Entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepository extends JpaRepository<Events,Long> {
}
