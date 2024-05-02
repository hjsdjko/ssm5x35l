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


import com.dao.JiyangDao;
import com.entity.JiyangEntity;
import com.service.JiyangService;
import com.entity.vo.JiyangVO;
import com.entity.view.JiyangView;

@Service("jiyangService")
public class JiyangServiceImpl extends ServiceImpl<JiyangDao, JiyangEntity> implements JiyangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiyangEntity> page = this.selectPage(
                new Query<JiyangEntity>(params).getPage(),
                new EntityWrapper<JiyangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiyangEntity> wrapper) {
		  Page<JiyangView> page =new Query<JiyangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiyangVO> selectListVO(Wrapper<JiyangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiyangVO selectVO(Wrapper<JiyangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiyangView> selectListView(Wrapper<JiyangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiyangView selectView(Wrapper<JiyangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
