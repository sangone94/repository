package com.study.nlc.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
public class ComEntity {
    @Id
    private String com_cd;
    private String com_lev;
    private String up_com_cd;
    private String com_nm;

    public ComEntity() {

    }

}
