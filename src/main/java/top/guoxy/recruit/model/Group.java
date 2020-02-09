package top.guoxy.recruit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "group_model")
public class Group {
    @Id
    @GeneratedValue
    private int Id;
    private String name;
}
