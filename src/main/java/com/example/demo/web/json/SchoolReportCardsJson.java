package com.example.demo.web.json;

import com.example.demo.web.domain.SchoolReportCard;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-27
 * Time: 23:17
 */
public class SchoolReportCardsJson extends BaseJson{
    private List<SchoolReportCard> rows;

    public List<SchoolReportCard> getRows() {
        return rows;
    }

    public void setRows(List<SchoolReportCard> rows) {
        this.rows = rows;
    }
}
