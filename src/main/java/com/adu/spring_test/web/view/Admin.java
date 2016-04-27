package com.adu.spring_test.web.view;

import com.adu.spring_test.web.model.Stringfy;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author yunjie.du
 * @date 2016/4/25 17:19
 */
@XmlRootElement(name = "admin")
public class Admin extends Stringfy {

    private String name;

    private int age;

    //NOTE:XmlElement只能放在get方法上。
    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
