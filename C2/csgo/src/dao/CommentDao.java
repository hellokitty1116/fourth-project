package dao;

import java.util.List;
import model.Comment;

public interface CommentDao {
    void add(Comment c);
    List<Comment> getAllComments();
}
