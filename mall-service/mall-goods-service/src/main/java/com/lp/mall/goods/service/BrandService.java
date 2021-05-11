package com.lp.mall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.mall.goods.model.Brand;

import java.util.List;

/**
 * @author lp
 * @date 2021-05-11 16:18
 */
public interface BrandService extends IService<Brand> {
    /****
     * 条件查询
     * return List<Brand>
     */
    List<Brand> queryList(Brand brand);

    /****
     * 条件分页查询
     * return Page<Brand>
     */
    Page<Brand> queryPageList(Brand brand, Long currentPage, Long size);
}
