package com.dao;

import com.entity.JianxiuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianxiuxinxiVO;
import com.entity.view.JianxiuxinxiView;


/**
 * 检修信息
 * 
 * @author 
 * @email 
 * @date 2022-03-22 14:53:31
 */
public interface JianxiuxinxiDao extends BaseMapper<JianxiuxinxiEntity> {
	
	List<JianxiuxinxiVO> selectListVO(@Param("ew") Wrapper<JianxiuxinxiEntity> wrapper);
	
	JianxiuxinxiVO selectVO(@Param("ew") Wrapper<JianxiuxinxiEntity> wrapper);
	
	List<JianxiuxinxiView> selectListView(@Param("ew") Wrapper<JianxiuxinxiEntity> wrapper);

	List<JianxiuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JianxiuxinxiEntity> wrapper);
	
	JianxiuxinxiView selectView(@Param("ew") Wrapper<JianxiuxinxiEntity> wrapper);
	

}
