package com.kpzx.certisys.dao;

import com.kpzx.certisys.dao.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryDao extends JpaRepository<Category,Integer> {
}
