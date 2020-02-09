package top.guoxy.recruit.model;

import javax.persistence.*;

@Entity(name = "likes")
public class LikeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int freshmanId;
    private String name;
    @ManyToOne
    private FreshmanModel freshman;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFreshmanId() {
        return freshmanId;
    }

    public void setFreshmanId(int freshmanId) {
        this.freshmanId = freshmanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
