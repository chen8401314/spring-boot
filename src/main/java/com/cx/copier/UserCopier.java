package com.cx.copier;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.cx.domain.User;
import com.cx.response.UserResponse;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserCopier {
	UserCopier INSTANCE = Mappers.getMapper(UserCopier.class);
	
	UserResponse asUserDto(User bean);
	
	
}
