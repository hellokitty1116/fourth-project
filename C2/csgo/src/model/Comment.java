package model;

public class Comment {
    private Integer id;
    private String memberno;
    private String name;
    private String comment;
    private String time;

    public Comment() {
        super();
    }

    public Comment(String memberno, String name, String comment, String time) {
        super();
        this.memberno = memberno;
        this.name = name;
        this.comment = comment;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberno() {
        return memberno;
    }

    public void setMemberno(String memberno) {
        this.memberno = memberno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
