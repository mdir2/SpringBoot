package me.wook.transaction.user.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@Builder
public class UserDto {
    @Id
    private int id;
    @Column
    private String name;
}
