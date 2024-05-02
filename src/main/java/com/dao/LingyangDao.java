package com.dao;

import com.entity.LingyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingyangVO;
import com.entity.view.LingyangView;


/**
 * 领养
 * 
 * @author 
 * @email 
 * @date 2021-04-15 20:04:19
 */
public interface LingyangDao extends BaseMapper<LingyangEntity> {
	
	List<LingyangVO> selectListVO(@Param("ew") Wrapper<LingyangEntity> wrapper);
	
	LingyangVO selectVO(@Param("ew") Wrapper<LingyangEntity> wrapper);
	
	List<LingyangView> selectListView(@Param("ew") Wrapper<LingyangEntity> wrapper);

	List<LingyangView> selectListView(Pagination page,@Param("ew") Wrapper<LingyangEntity> wrapper);
	
	LingyangView selectView(@Param("ew") Wrapper<LingyangEntity> wrapper);
	
}
