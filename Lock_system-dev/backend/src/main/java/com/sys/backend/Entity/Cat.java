package com.sys.backend.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="t_cat")
public class Cat {
    @Id
    private int cat_id;
    @Column
    private String sex;

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "cat_id=" + cat_id +
                ", sex='" + sex + '\'' +
                '}';
    }
}
