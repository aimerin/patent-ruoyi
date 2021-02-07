package com.ruoyi.patent.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.patent.domain.Patent;
import com.ruoyi.patent.service.IPatentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【专利】Controller
 * 
 * @author ruoyi
 * @date 2021-02-04
 */
@RestController
@RequestMapping("/system/patent")
public class PatentController extends BaseController
{
    @Autowired
    private IPatentService patentService;
    /**
     * 搜索【专利】列表
     */
    @RequestMapping("/search")
    @ResponseBody
    public AjaxResult search(String keyWord){


        return AjaxResult.success(patentService.searchByKeyWord(keyWord));
    }
    /**
     * 查询【专利】列表
     */
    //@PreAuthorize("@ss.hasPermi('system:patent:list')")
    @GetMapping("/list")
    public TableDataInfo list(Patent patent)
        {
        startPage();
        List<Patent> list = patentService.selectPatentList(patent);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
   // @PreAuthorize("@ss.hasPermi('system:patent:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Patent patent)
    {
        List<Patent> list = patentService.selectPatentList(patent);
        ExcelUtil<Patent> util = new ExcelUtil<Patent>(Patent.class);
        return util.exportExcel(list, "patent");
    }

    /**
     * 获取【专利】详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:patent:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(patentService.selectPatentById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
   // @PreAuthorize("@ss.hasPermi('system:patent:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Patent patent)
    {
        return toAjax(patentService.insertPatent(patent));
    }

    /**
     * 修改【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:patent:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Patent patent)
    {
        return toAjax(patentService.updatePatent(patent));
    }

    /**
     * 删除【请填写功能名称】
     */
    //  @PreAuthorize("@ss.hasPermi('system:patent:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(patentService.deletePatentByIds(ids));
    }
}
