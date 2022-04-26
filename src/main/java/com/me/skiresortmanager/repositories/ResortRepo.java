package com.me.skiresortmanager.repositories;


import com.me.skiresortmanager.domains.Resort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResortRepo extends JpaRepository<Resort, Long> {
}
