package com.mitrahsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mitrahsoft.entity.*;
import com.mitrahsoft.entity.Player;
@Repository
public interface PlayRep extends JpaRepository<Player,Integer> {

}
