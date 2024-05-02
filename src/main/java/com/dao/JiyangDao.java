package com.dao;

import com.entity.JiyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiyangVO;
import com.entity.view.JiyangView;


/**
 * 寄养
 * 
 * @author 
 * @email 
 * @date 2021-04-15 20:04:19
 */
public interface JiyangDao extends BaseMapper<JiyangEntity> {
	
	List<JiyangVO> selectListVO(@Param("ew") Wrapper<JiyangEntity> wrapper);
	
	JiyangVO selectVO(@Param("ew") Wrapper<JiyangEntity> wrapper);
	
	List<JiyangView> selectListView(@Param("ew") Wrapper<JiyangEntity> wrapper);

	List<JiyangView> selectListView(Pagination page,@Param("ew") Wrapper<JiyangEntity> wrapper);
	
	JiyangView selectView(@Param("ew") Wrapper<JiyangEntity> wrapper);
	
}
