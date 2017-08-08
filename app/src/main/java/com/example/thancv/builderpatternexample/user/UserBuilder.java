package com.example.thancv.builderpatternexample.user;

/**
 * Created by ThanCV on 8/7/2017.
 */

public class UserBuilder {
    private User user;

    public UserBuilder(User user) {
        this.user = user;
    }

    public UserBuilder name(String name) {
        user.setName(name);
        return this;
    }

    public UserBuilder age(String age) {
        user.setAge(age);
        return this;
    }

    public UserBuilder address(String address) {
        user.setAddress(address);
        return this;
    }

    public UserBuilder build() {
        return new UserBuilder(user);
    }

    public String toString() {
        return user.getName() + "-" + user.getAddress() + "-" + user.getAge();
    }

}
