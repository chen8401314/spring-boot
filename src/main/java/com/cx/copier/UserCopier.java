package com.cx.copier;

import com.cx.request.SaveUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.cx.domain.User;
import com.cx.response.UserResponse;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserCopier {
	UserCopier INSTANCE = Mappers.getMapper(UserCopier.class);

	@Mapping(target = "testName", source = "name")
	UserResponse map(User bean);
	
	User map(SaveUserRequest bean);
}
