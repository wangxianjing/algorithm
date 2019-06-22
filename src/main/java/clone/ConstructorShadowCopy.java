package main.java.clone;

/**
 * Created by wong on 2019/6/14.
 */
public class ConstructorShadowCopy implements Cloneable{
    private Integer age;
    private String name;

    public ConstructorShadowCopy(Integer age, String name) {
        this.name = name;
        this.age = age;
    }

    public ConstructorShadowCopy(ConstructorShadowCopy constructorShadowCopy) {
        this.age = constructorShadowCopy.age;
        this.name = constructorShadowCopy.name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
