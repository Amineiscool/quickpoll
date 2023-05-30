package com.apress.domain;
import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


    @Entity
    public class Option {


        @Id
        @GeneratedValue

        @Column(name="OPTION_ID")
        private Long id;
        @Column(name="OPTION_VALUE")
        private String value;

        public Option() {

        }


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        // Getters and Setters omitted for brevity


        @Override
        public String toString() {
            return "Option{" +
                    "id=" + id +
                    ", value='" + value + '\'' +
                    '}';
        }
    }
