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
public class UserEntity {
    @Id
    private String user_no;
    private String user_name;
    private String user_type;
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
