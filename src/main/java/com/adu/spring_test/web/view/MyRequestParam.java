package com.adu.spring_test.web.view;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import com.adu.spring_test.web.model.Stringfy;

/**
 * @author yunjie.du
 * @date 2016/4/25 14:21
 */
public class MyRequestParam extends Stringfy {
    @NotNull
    @Pattern(regexp = "[a-b]\\.[1-5]")
    private String type;

    @Range(min = 1,max = 10,message = "number必须在范围[1,10]内")
    private BigDecimal number;

    @NumberFormat(pattern = "#.##%")
    private BigDecimal progress;

    @Future
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    @Size(min = 1)
    @Valid
    List<User> users;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public BigDecimal getProgress() {
        return progress;
    }

    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
