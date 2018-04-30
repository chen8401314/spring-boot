package com.cx.entity;

import java.io.Serializable;

import com.cx.domain.User;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ExtUser extends User implements Serializable {

	private static final long serialVersionUID = 2827929303060389560L;

	private String ext;
	
}
