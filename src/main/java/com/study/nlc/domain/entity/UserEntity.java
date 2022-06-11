package com.study.nlc.domain.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
public class UserEntity {
    @Id
    private String user_no;
    private String user_status;
    private String tel1;
    private String tel2;
    private String tel3;
    private String login_id;
    private String password;
    private String addr;
    private String addr_dtl;

    public UserEntity() {

    }
}
