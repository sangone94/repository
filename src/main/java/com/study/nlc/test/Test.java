package com.study.nlc.test;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Test {
    @Id
    private String id;
    private String etc;

    @Builder
    Test(String id, String etc) {
        this.id = id;
        this.etc = etc;
    }

    public Test() {
    }
}
