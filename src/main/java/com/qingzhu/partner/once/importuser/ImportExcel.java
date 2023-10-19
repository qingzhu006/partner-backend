package com.qingzhu.partner.once.importuser;

import com.alibaba.excel.EasyExcel;

import java.util.List;

/**
 * 导入 Excel
 *
 * @author qingzhu
 */
public class ImportExcel {

    /**
     * 读取数据
     */
    public static void main(String[] args) {
        // todo 记得改为自己的测试文件
        String fileName = "E:\\partner-backend\\src\\main\\resources\\testExcel.xlsx";
//        readByListener(fileName);
        synchronousRead(fileName);
    }

    /**
     * 监听器读取
     *
     * @param fileName
     */
    public static void readByListener(String fileName) {
        EasyExcel.read(fileName, ExcelTableUserInfo.class, new TableListener()).sheet().doRead();
    }


    /**
     * 同步读
     *
     * @param fileName
     */
    public static void synchronousRead(String fileName) {
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 同步读取会自动finish
        List<ExcelTableUserInfo> totalDataList =
                EasyExcel.read(fileName).head(ExcelTableUserInfo.class).sheet().doReadSync();
        for (ExcelTableUserInfo excelTableUserInfo : totalDataList) {
            System.out.println(excelTableUserInfo);
        }
    }

}
