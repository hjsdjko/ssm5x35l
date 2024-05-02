package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiyangjieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiyangjieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiyangjieguoView;


/**
 * 寄养结果
 *
 * @author 
 * @email 
 * @date 2021-04-15 20:04:19
 */
public interface JiyangjieguoService extends IService<JiyangjieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiyangjieguoVO> selectListVO(Wrapper<JiyangjieguoEntity> wrapper);
   	
   	JiyangjieguoVO selectVO(@Param("ew") Wrapper<JiyangjieguoEntity> wrapper);
   	
   	List<JiyangjieguoView> selectListView(Wrapper<JiyangjieguoEntity> wrapper);
   	
   	JiyangjieguoView selectView(@Param("ew") Wrapper<JiyangjieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiyangjieguoEntity> wrapper);
   	
}

