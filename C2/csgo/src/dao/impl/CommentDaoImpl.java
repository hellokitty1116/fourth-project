package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

import dao.CommentDao;
import dao.DbConnection;
import model.Comment;

public class CommentDaoImpl implements CommentDao {

    @Override
    public void add(Comment c) {
        Connection conn = DbConnection.getDb();
        String SQL = "INSERT INTO comment (memberno, name, comment, time) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, c.getMemberno());
            ps.setString(2, c.getName());
            ps.setString(3, c.getComment());
            ZonedDateTime now = ZonedDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
            ps.setString(4, now.format(formatter).toString());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Comment> getAllComments() {
        Connection conn = DbConnection.getDb();
        String SQL = "SELECT * FROM comment";
        List<Comment> comments = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Comment c = new Comment();
                c.setId(rs.getInt("id"));
                c.setMemberno(rs.getString("memberno"));
                c.setName(rs.getString("name"));
                c.setComment(rs.getString("comment"));
                c.setTime(rs.getString("time"));
                comments.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comments;
    }
}
