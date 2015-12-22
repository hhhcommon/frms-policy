package cn.com.bsfit.frms.policy.mapper;

import cn.com.bsfit.frms.policy.pojo.Risks;
import cn.com.bsfit.frms.policy.pojo.RisksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RisksMapper {
    int countByExample(RisksExample example);

    int deleteByExample(RisksExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Risks record);

    int insertSelective(Risks record);

    List<Risks> selectByExample(RisksExample example);

    Risks selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Risks record, @Param("example") RisksExample example);

    int updateByExample(@Param("record") Risks record, @Param("example") RisksExample example);

    int updateByPrimaryKeySelective(Risks record);

    int updateByPrimaryKey(Risks record);
}