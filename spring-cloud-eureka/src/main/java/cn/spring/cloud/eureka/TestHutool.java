package cn.spring.cloud.eureka;
import java.util.Date;

import cn.hutool.core.date.DateUtil;

public class TestHutool {
	public static void main(String[] args) {
        String dateStr = "2012-12-12 12:12:12随便改一下";
        Date date = DateUtil.parse(dateStr);
        System.out.println(date);
    }
}
