package com.ruoyi.patent.service.impl;

import java.util.List;

import com.ruoyi.patent.domain.Patent;
import com.ruoyi.patent.mapper.PatentMapper;
import com.ruoyi.patent.service.IPatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-02-04
 */
@Service
public class PatentServiceImpl implements IPatentService
{
    @Autowired
    private PatentMapper patentMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Patent selectPatentById(Long id)
    {
        return patentMapper.selectPatentById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param patent 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Patent> selectPatentList(Patent patent)
    {
        return patentMapper.selectPatentList(patent);
    }

    @Override
    public List<Patent> searchByKeyWord(String keyWord) {
        return patentMapper.searchByKeyWord(keyWord);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param patent 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPatent(Patent patent)
    {
        return patentMapper.insertPatent(patent);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param patent 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePatent(Patent patent)
    {
        return patentMapper.updatePatent(patent);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deletePatentByIds(Long[] ids)
    {
        return patentMapper.deletePatentByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deletePatentById(Long id)
    {
        return patentMapper.deletePatentById(id);
    }
}
