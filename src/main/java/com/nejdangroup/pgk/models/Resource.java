package com.nejdangroup.pgk.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Resource")
@Getter
@Setter
@NoArgsConstructor
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "resource_name")
    private String resourceName;

    @Column(name = "resource_password")
    private String resourcePassword;

    @Column(name = "resource_url")
    private String resourceUrl;

    @Column(name = "picture_url")
    private String pictureUrl;

    public Resource(String resourceName, String resourcePassword, String resourceUrl, String pictureUrl) {
        this.resourceName = resourceName;
        this.resourcePassword = resourcePassword;
        this.resourceUrl = resourceUrl;
        this.pictureUrl = pictureUrl;
    }
}
