package com.ruoyi.patent.service;

import java.util.List;
import com.ruoyi.patent.domain.Patent;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2021-02-04
 */
public interface IPatentService 
{
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
     * 查询【请填写功能名称】列表
     *
     * @param keyWord 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Patent> searchByKeyWord(String keyWord);
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
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deletePatentByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deletePatentById(Long id);
}
