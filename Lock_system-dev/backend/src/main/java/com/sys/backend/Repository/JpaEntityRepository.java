package com.sys.backend.Repository;

import com.sys.backend.Entity.Entity_demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaEntityRepository extends JpaRepository<Entity_demo, Integer> {
    /*
    该Repository是一个jpa的接口的demo，对应的是Entity_demo实体，所有查询都只需要利用该接口即可，如有特殊需求的查询，只需要在该接口中添加声明即可
     */
}
