package com.dao;

import com.entity.JiyangjieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiyangjieguoVO;
import com.entity.view.JiyangjieguoView;


/**
 * 寄养结果
 * 
 * @author 
 * @email 
 * @date 2021-04-15 20:04:19
 */
public interface JiyangjieguoDao extends BaseMapper<JiyangjieguoEntity> {
	
	List<JiyangjieguoVO> selectListVO(@Param("ew") Wrapper<JiyangjieguoEntity> wrapper);
	
	JiyangjieguoVO selectVO(@Param("ew") Wrapper<JiyangjieguoEntity> wrapper);
	
	List<JiyangjieguoView> selectListView(@Param("ew") Wrapper<JiyangjieguoEntity> wrapper);

	List<JiyangjieguoView> selectListView(Pagination page,@Param("ew") Wrapper<JiyangjieguoEntity> wrapper);
	
	JiyangjieguoView selectView(@Param("ew") Wrapper<JiyangjieguoEntity> wrapper);
	
}
