package com.fatihucar.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatihucar.demo.model.Folder;

public interface FolderRepository extends JpaRepository<Folder, Long>{

}
