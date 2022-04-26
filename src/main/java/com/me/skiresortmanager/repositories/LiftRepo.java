package com.me.skiresortmanager.repositories;

import com.me.skiresortmanager.domains.Lift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface LiftRepo extends JpaRepository<Lift, Long> {

}
