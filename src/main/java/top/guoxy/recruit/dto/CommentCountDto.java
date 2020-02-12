package top.guoxy.recruit.dto;

/**
 * @author: GuoXinYu <gxylong@126.com>
 * @datetime: 2020/2/12 17:16
 **/
public class CommentCountDto {
    private int FreshmanId;
    private int commentCount;
    public int getFreshmanId() {
        return FreshmanId;
    }

    public void setFreshmanId(int freshmanId) {
        FreshmanId = freshmanId;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}
