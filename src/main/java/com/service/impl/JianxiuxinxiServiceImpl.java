package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JianxiuxinxiDao;
import com.entity.JianxiuxinxiEntity;
import com.service.JianxiuxinxiService;
import com.entity.vo.JianxiuxinxiVO;
import com.entity.view.JianxiuxinxiView;

@Service("jianxiuxinxiService")
public class JianxiuxinxiServiceImpl extends ServiceImpl<JianxiuxinxiDao, JianxiuxinxiEntity> implements JianxiuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianxiuxinxiEntity> page = this.selectPage(
                new Query<JianxiuxinxiEntity>(params).getPage(),
                new EntityWrapper<JianxiuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianxiuxinxiEntity> wrapper) {
		  Page<JianxiuxinxiView> page =new Query<JianxiuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianxiuxinxiVO> selectListVO(Wrapper<JianxiuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianxiuxinxiVO selectVO(Wrapper<JianxiuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianxiuxinxiView> selectListView(Wrapper<JianxiuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianxiuxinxiView selectView(Wrapper<JianxiuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
