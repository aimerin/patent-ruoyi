package com.ruoyi.patent.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 patent
 * 
 * @author ruoyi
 * @date 2021-02-04
 */
public class Patent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 唯一标识(主键） */
    private Long id;

    /** 专利名称 */
    @Excel(name = "专利名称")
    private String patentTitle;

    /** 公开号 */
    @Excel(name = "公开号")
    private String documentNumber;

    /** 公开日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "公开日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date documentDate;

    /** 申请号 */
    @Excel(name = "申请号")
    private String applicationNumber;

    /** 申请日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applicationDate;

    /** 申请人 */
    @Excel(name = "申请人")
    private String applicant;

    /** 发明人 */
    @Excel(name = "发明人")
    private String inventor;

    /** IPC分类号 */
    @Excel(name = "IPC分类号")
    private String ipc;

    /** 摘要 */
    @Excel(name = "摘要")
    private String summary;

    /** 法律信息 */
    @Excel(name = "法律信息")
    private String legalInfo;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPatentTitle(String patentTitle) 
    {
        this.patentTitle = patentTitle;
    }

    public String getPatentTitle() 
    {
        return patentTitle;
    }
    public void setDocumentNumber(String documentNumber) 
    {
        this.documentNumber = documentNumber;
    }

    public String getDocumentNumber() 
    {
        return documentNumber;
    }
    public void setDocumentDate(Date documentDate) 
    {
        this.documentDate = documentDate;
    }

    public Date getDocumentDate() 
    {
        return documentDate;
    }
    public void setApplicationNumber(String applicationNumber) 
    {
        this.applicationNumber = applicationNumber;
    }

    public String getApplicationNumber() 
    {
        return applicationNumber;
    }
    public void setApplicationDate(Date applicationDate) 
    {
        this.applicationDate = applicationDate;
    }

    public Date getApplicationDate() 
    {
        return applicationDate;
    }
    public void setApplicant(String applicant) 
    {
        this.applicant = applicant;
    }

    public String getApplicant() 
    {
        return applicant;
    }
    public void setInventor(String inventor) 
    {
        this.inventor = inventor;
    }

    public String getInventor() 
    {
        return inventor;
    }
    public void setIpc(String ipc) 
    {
        this.ipc = ipc;
    }

    public String getIpc() 
    {
        return ipc;
    }
    public void setSummary(String summary) 
    {
        this.summary = summary;
    }

    public String getSummary() 
    {
        return summary;
    }
    public void setLegalInfo(String legalInfo) 
    {
        this.legalInfo = legalInfo;
    }

    public String getLegalInfo() 
    {
        return legalInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("patentTitle", getPatentTitle())
            .append("documentNumber", getDocumentNumber())
            .append("documentDate", getDocumentDate())
            .append("applicationNumber", getApplicationNumber())
            .append("applicationDate", getApplicationDate())
            .append("applicant", getApplicant())
            .append("inventor", getInventor())
            .append("ipc", getIpc())
            .append("summary", getSummary())
            .append("legalInfo", getLegalInfo())
            .toString();
    }
}
