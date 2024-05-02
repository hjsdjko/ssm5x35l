package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiyangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiyangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiyangView;


/**
 * 寄养
 *
 * @author 
 * @email 
 * @date 2021-04-15 20:04:19
 */
public interface JiyangService extends IService<JiyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiyangVO> selectListVO(Wrapper<JiyangEntity> wrapper);
   	
   	JiyangVO selectVO(@Param("ew") Wrapper<JiyangEntity> wrapper);
   	
   	List<JiyangView> selectListView(Wrapper<JiyangEntity> wrapper);
   	
   	JiyangView selectView(@Param("ew") Wrapper<JiyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiyangEntity> wrapper);
   	
}

