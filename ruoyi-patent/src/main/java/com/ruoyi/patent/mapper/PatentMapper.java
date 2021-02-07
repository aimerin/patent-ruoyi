package com.ruoyi.patent.mapper;

import java.util.List;
import com.ruoyi.patent.domain.Patent;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-02-04
 */
public interface PatentMapper 
{
    /**
     * 搜索【请填写功能名称】
     *
     * @param keyWord 【请填写功能名称】关键词
     * @return 【请填写功能名称】
     */
    public List<Patent> searchByKeyWord(String keyWord);
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Patent selectPatentById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param patent 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Patent> selectPatentList(Patent patent);

    /**
     * 新增【请填写功能名称】
     * 
     * @param patent 【请填写功能名称】
     * @return 结果
     */
    public int insertPatent(Patent patent);

    /**
     * 修改【请填写功能名称】
     * 
     * @param patent 【请填写功能名称】
     * @return 结果
     */
    public int updatePatent(Patent patent);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deletePatentById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePatentByIds(Long[] ids);
}
