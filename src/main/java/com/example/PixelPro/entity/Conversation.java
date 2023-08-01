package com.example.PixelPro.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cnum;
    private String cname;
    private String cdate;

}