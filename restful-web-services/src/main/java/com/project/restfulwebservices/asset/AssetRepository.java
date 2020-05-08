package com.project.restfulwebservices.asset;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.project.restfulwebservices.asset.AssetJpa;
 
@Repository
public interface AssetRepository extends JpaRepository<AssetJpa, Long> {
	List<AssetJpa> findByUsername(String username);

	Optional<AssetJpa> findById(Long id);
}