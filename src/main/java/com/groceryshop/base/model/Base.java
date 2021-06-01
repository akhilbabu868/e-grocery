package com.groceryshop.base.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class  Base{

	
	    @Id
	    @GeneratedValue
	    @Column(name = "id", unique = true, nullable = false)
	    private Integer id;
	    
	     
	    @CreatedDate
	    @Column(name="created_date", nullable = true, updatable = false)
	    private Date createddate;
	    
	    
	    @LastModifiedDate
	    @Column(name = "updated_at",nullable = true, updatable = false)
	    private LocalDateTime updatedAt;
	    
	    @Column(name="status")
	    private String status;


	
	    
	    
	    
}
