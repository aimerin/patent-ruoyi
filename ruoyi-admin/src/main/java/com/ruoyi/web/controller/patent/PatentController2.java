package com.ruoyi.web.controller.patent;

import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatentController2 {
    @GetMapping("/patent2")
    public AjaxResult hello(){
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.put("desc", "helloPatent");
        System.out.println("helloPatent");
        return ajaxResult;
    }
}
