package com.cvilia.netease.sqlmodel;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * author: lzy
 * date: 3/5/21
 * describe：描述
 */
@Entity
public class User {
    @Id
    public long id;
    public String name;
}
