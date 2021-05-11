package com.lp.mall.goods.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lp.mall.goods.model.Brand;
import com.lp.mall.goods.service.BrandService;
import com.lp.mall.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lp
 * @date 2021-05-11 16:25
 */
@RestController
@RequestMapping(value = "/brand")
public class BrandController {
    @Resource
    private BrandService brandService;

    /****
     * 增加方法
     */
    @PostMapping
    public Result add(@RequestBody Brand brand){
        brandService.save(brand);
        return Result.ok();
    }

    /****
     * 修改方法
     */
    @PutMapping
    public Result update(@RequestBody Brand brand){
        brandService.updateById(brand);
        return Result.ok();
    }

    /****
     * 删除方法
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable(value = "id")String id){
        brandService.removeById(id);
        return Result.ok();
    }

    /****
     * 条件查询
     */
    @PostMapping(value = "/search")
    public Result<List<Brand>> queryList(@RequestBody Brand brand){
        List<Brand> brands = brandService.queryList(brand);
        return Result.ok(brands);
    }

    /****
     * 条件查询-分页
     */
    @PostMapping(value = "/search/{page}/{size}")
    public Result<Page<Brand>> queryPageList(
            @PathVariable(value = "page")Long page,
            @PathVariable(value = "size")Long size,
            @RequestBody Brand brand){
        Page<Brand> pageInfo = brandService.queryPageList(brand,page,size);
        return Result.ok(pageInfo);
    }
}
