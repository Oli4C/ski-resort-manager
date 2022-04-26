package com.me.skiresortmanager.repositories;


import com.me.skiresortmanager.domains.Slope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlopeRepo extends JpaRepository<Slope, Long> {
}
