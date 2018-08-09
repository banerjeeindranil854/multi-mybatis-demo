package org.indranil.multimybatisdemo.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AnotherMapper {
	@Select("SELECT DATABASE()")
	String getVersion();
}
