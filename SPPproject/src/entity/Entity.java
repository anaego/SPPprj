package entity;

import java.io.Serializable;

/**
 * Created by Администратор on 28.04.2017.
 */
public abstract class Entity implements Serializable, Cloneable {
    private Integer id;

    public Entity() {
    }

    public Entity(Integer id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
