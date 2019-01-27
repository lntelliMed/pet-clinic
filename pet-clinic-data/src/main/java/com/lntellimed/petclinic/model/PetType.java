package com.lntellimed.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@Builder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
	@Column(name = "name")
	private String name;
	
	@Override
    public String toString() {
        return name;
    }
}
