package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianxiuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianxiuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianxiuxinxiView;


/**
 * 检修信息
 *
 * @author 
 * @email 
 * @date 2022-03-22 14:53:31
 */
public interface JianxiuxinxiService extends IService<JianxiuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianxiuxinxiVO> selectListVO(Wrapper<JianxiuxinxiEntity> wrapper);
   	
   	JianxiuxinxiVO selectVO(@Param("ew") Wrapper<JianxiuxinxiEntity> wrapper);
   	
   	List<JianxiuxinxiView> selectListView(Wrapper<JianxiuxinxiEntity> wrapper);
   	
   	JianxiuxinxiView selectView(@Param("ew") Wrapper<JianxiuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianxiuxinxiEntity> wrapper);
   	

}

