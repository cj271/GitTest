package com.sys.backend.Entity;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Date;

@Data                                           //自动生成实体类的Getter和Setter
@Entity                                         //表明为实体类
@Table(name="Table_demo")                       //将该实体类与数据库中的表对应
@EntityListeners(AuditingEntityListener.class)  //事件监听，可以用于自动生成创建者，创建日期，修改者，修改日期等
public class Entity_demo {
    /*
    实体类demo，其中包括主键Id，普通属性Col_demo，版本属性Objversion_demo，创建者Created_By，创建日期Created_Date，最后的修改者
LastModifiedBy，最后的修改日期LastModifiedDate
    */
    @Id                                                 //主键注释
    @Column(name="ID")                                  //数据库中的属性名
    @GeneratedValue                                     //自动生成值
    private int id;

    @Column(name="Col_demo")
    private String Col_demo;

    @Column(name="Objversion_demo")
    @Version                                            //该实体的版本，本项目不一定用得到
    private int Objversion_demo;

    @Column(name="Created_By")
    @CreatedBy                                          //自动生成创建者
    private String Create_By;

    @Column(name="Created_Date")
    @CreatedDate                                        //自动生成创建时间
    private Date Created_Date;

    @Column(name="LastModifiedBy")
    @LastModifiedBy                                     //自动生成最后更改者
    private String LastModifiedBy;

    @Column(name="LastModifiedDate")
    @LastModifiedDate                                   //自动生成最后更改时间
    private Date LastmodifiedDate;
}
