package tech.wetech.weshop.marketing.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.wetech.weshop.api.Api;
import tech.wetech.weshop.marketing.dto.CommentCountDTO;
import tech.wetech.weshop.marketing.dto.CommentResultDTO;
import tech.wetech.weshop.marketing.po.Comment;
import tech.wetech.weshop.marketing.query.CommentQuery;

import java.util.List;

@RequestMapping("/comment")
@FeignClient("weshop-topic-service")
public interface CommentApi extends Api<Comment> {

    @GetMapping("/queryList2")
    List<CommentResultDTO> queryList(CommentQuery commentQuery);

    @GetMapping("/countList")
    CommentCountDTO countList(CommentQuery commentQuery);
}