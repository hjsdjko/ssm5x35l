package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingyangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingyangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyangView;


/**
 * 领养
 *
 * @author 
 * @email 
 * @date 2021-04-15 20:04:19
 */
public interface LingyangService extends IService<LingyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingyangVO> selectListVO(Wrapper<LingyangEntity> wrapper);
   	
   	LingyangVO selectVO(@Param("ew") Wrapper<LingyangEntity> wrapper);
   	
   	List<LingyangView> selectListView(Wrapper<LingyangEntity> wrapper);
   	
   	LingyangView selectView(@Param("ew") Wrapper<LingyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingyangEntity> wrapper);
   	
}

