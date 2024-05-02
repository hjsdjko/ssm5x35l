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


import com.dao.JiyangjieguoDao;
import com.entity.JiyangjieguoEntity;
import com.service.JiyangjieguoService;
import com.entity.vo.JiyangjieguoVO;
import com.entity.view.JiyangjieguoView;

@Service("jiyangjieguoService")
public class JiyangjieguoServiceImpl extends ServiceImpl<JiyangjieguoDao, JiyangjieguoEntity> implements JiyangjieguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiyangjieguoEntity> page = this.selectPage(
                new Query<JiyangjieguoEntity>(params).getPage(),
                new EntityWrapper<JiyangjieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiyangjieguoEntity> wrapper) {
		  Page<JiyangjieguoView> page =new Query<JiyangjieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiyangjieguoVO> selectListVO(Wrapper<JiyangjieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiyangjieguoVO selectVO(Wrapper<JiyangjieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiyangjieguoView> selectListView(Wrapper<JiyangjieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiyangjieguoView selectView(Wrapper<JiyangjieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
