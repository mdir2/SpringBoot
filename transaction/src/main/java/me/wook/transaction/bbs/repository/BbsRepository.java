package me.wook.transaction.bbs.repository;

import me.wook.transaction.bbs.entity.Bbs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BbsRepository extends JpaRepository<Bbs, Long> {
}
