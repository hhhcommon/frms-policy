package cn.com.bsfit.frms.policy.mapper;

import cn.com.bsfit.frms.policy.pojo.RiskArchives;
import cn.com.bsfit.frms.policy.pojo.RiskArchivesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiskArchivesMapper {
    int countByExample(RiskArchivesExample example);

    int deleteByExample(RiskArchivesExample example);

    int deleteByPrimaryKey(Long archivesId);

    long insert(RiskArchives record);

    long insertSelective(RiskArchives record);

    List<RiskArchives> selectByExample(RiskArchivesExample example);

    RiskArchives selectByPrimaryKey(Long archivesId);

    int updateByExampleSelective(@Param("record") RiskArchives record, @Param("example") RiskArchivesExample example);

    int updateByExample(@Param("record") RiskArchives record, @Param("example") RiskArchivesExample example);

    int updateByPrimaryKeySelective(RiskArchives record);

    int updateByPrimaryKey(RiskArchives record);
}