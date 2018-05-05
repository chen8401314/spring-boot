package com.cx.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="请求体")
public class GetUserRequest extends BaseRequest {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty("主键")
	private Long id;
}
