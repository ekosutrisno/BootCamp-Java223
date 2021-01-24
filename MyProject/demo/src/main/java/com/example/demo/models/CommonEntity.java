package com.example.demo.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@MappedSuperclass
public class CommonEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_on",nullable = false)
    private Date createdOn;

    @Column(name = "created_by",nullable = false)
    private  String createdBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modifed_on")
    private  Date modifedOn;
<<<<<<< HEAD

=======
>>>>>>> 2e3540f8efdd4596ee2ade7dadcc4e6151d49337
    @Column(name = "modifed_by")
    private String modifedBy;

    @Column(name = "is_delete",nullable = false)
    private Boolean isDelete;
}
