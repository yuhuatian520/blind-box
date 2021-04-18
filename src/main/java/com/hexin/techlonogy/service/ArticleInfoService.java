package com.hexin.techlonogy.service;

import com.hexin.techlonogy.entity.ArticleInfo;
import com.hexin.techlonogy.utils.json.JsonResult;
import com.hexin.techlonogy.vo.noticeinfovo.articleinfovo.ArticleInfoVo;
import lombok.val;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hexin.techlonogy.mapper.ArticleInfoMapper;

import java.util.Comparator;
import java.util.stream.Collectors;

import static com.hexin.techlonogy.utils.json.JsonResult.ok;
import static java.util.stream.Collectors.toList;
import static org.springframework.beans.BeanUtils.copyProperties;

/**
 * @author 西南彭于晏
 * @date 2021-4-14 21:35
 */
@Service
public class ArticleInfoService {

    @Resource
    private ArticleInfoMapper articleInfoMapper;

    public JsonResult viewArticleInfos() {
        return ok(articleInfoMapper.select(ArticleInfo.builder().status((short) 1).build()).stream().parallel().sorted(Comparator.comparing(ArticleInfo::getSort)).map(s->{
            val articleInfoVo = ArticleInfoVo.builder().build();
            copyProperties(s,articleInfoVo);
            return articleInfoVo;
        }).collect(toList()));
    }
}


