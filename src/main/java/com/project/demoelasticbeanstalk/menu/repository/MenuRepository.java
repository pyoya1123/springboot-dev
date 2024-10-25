package com.project.demoelasticbeanstalk.menu.repository;

import com.project.demoelasticbeanstalk.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

}
