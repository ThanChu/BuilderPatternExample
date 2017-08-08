package com.example.thancv.builderpatternexample.user;

/**
 * Created by ThanCV on 8/7/2017.
 */

public class User {
    private String name;
    private String age;
    private String address;

   /* private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    /*public static class Builder {
        private String name;
        private String age;
        private String address;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(String age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }

        public String showInformation() {
            return name + "-" + age + "-" + address;
        }
    }*/
}
