package com.lumen.apicatalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lumen.apicatalog.model.ApiCatalogInfo;

@Repository
public interface ApiCatalogInfoRepository extends JpaRepository<ApiCatalogInfo, Long> {

	@Transactional
	@Query(value = "select * from TJAM_API_INFO where CATEGORY_ID=?1", nativeQuery = true)
	List<ApiCatalogInfo> getByCategoryId(String categoryId);

}
