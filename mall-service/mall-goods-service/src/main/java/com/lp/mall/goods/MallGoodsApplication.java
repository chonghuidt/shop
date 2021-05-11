package com.lp.mall.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lp
 * @date 2021-05-10 17:21
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.lp.mall.goods.mapper"})
public class MallGoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallGoodsApplication.class,args);
    }
}
