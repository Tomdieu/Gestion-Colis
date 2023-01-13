package com.example.tpinfo3055.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tpinfo3055.demo.Model.Expedition;

public interface ExpeditionRepository extends JpaRepository<Expedition,Long>{
    
}
