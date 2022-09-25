package com.game.repository;

import com.game.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface PlayersRepository extends JpaRepository<Player, Long>, PagingAndSortingRepository<Player, Long> {

    @Override
    void deleteById(Long l);

    @Override
    <S extends Player> S save(S entity);

    @Override
    Optional<Player> findById(Long l);

}