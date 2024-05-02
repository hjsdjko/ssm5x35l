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


import com.dao.LingyangDao;
import com.entity.LingyangEntity;
import com.service.LingyangService;
import com.entity.vo.LingyangVO;
import com.entity.view.LingyangView;

@Service("lingyangService")
public class LingyangServiceImpl extends ServiceImpl<LingyangDao, LingyangEntity> implements LingyangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingyangEntity> page = this.selectPage(
                new Query<LingyangEntity>(params).getPage(),
                new EntityWrapper<LingyangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingyangEntity> wrapper) {
		  Page<LingyangView> page =new Query<LingyangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingyangVO> selectListVO(Wrapper<LingyangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingyangVO selectVO(Wrapper<LingyangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingyangView> selectListView(Wrapper<LingyangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingyangView selectView(Wrapper<LingyangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
