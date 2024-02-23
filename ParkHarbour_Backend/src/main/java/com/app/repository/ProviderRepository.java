package com.app.repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Provider;

public interface ProviderRepository extends JpaRepository<Provider, Long> {

	List<Provider> findByProvider_id(long provider_id);
}
