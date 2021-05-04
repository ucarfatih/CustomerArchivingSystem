package com.fatihucar.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatihucar.demo.model.Folder;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long>{

}
