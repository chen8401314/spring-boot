package com.cx.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class SaveUserRequest extends BaseRequest {
	private static final long serialVersionUID = 1L;
	
	private String name;

	private int age;
}
