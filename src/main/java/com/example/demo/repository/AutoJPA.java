package com.example.demo.repository;

import com.example.demo.dto.AutoDTO;
import com.example.demo.model.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutoJPA  extends JpaRepository<Auto,Integer> {
    //@Override

    Auto findById(long id);



}
