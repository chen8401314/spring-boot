package com.cx.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "User", description = "用户对象")
public class UserDTO extends BaseDTO {
	private static final long serialVersionUID = -2219724352386175871L;

    @ApiModelProperty("主键")
    private long id;

    @ApiModelProperty("名字")
    private String testName;
}
