package cn.how2j.trend.web;

import cn.how2j.trend.pojo.Index;
import cn.how2j.trend.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    IndexService indexService;

    @GetMapping("/codes")
    public List<Index> get() {
        return indexService.fetchIndexesFromThirdPart();
    }
}
