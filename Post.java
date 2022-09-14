package Reddit;

import java.util.*;
import java.time.LocalDateTime;

public class Post {
    private String title;
    private String url;
    private String author;
    private int upvotes;
    private int downvotes;
    private LocalDateTime time;
    private List<Comment> comments = new ArrayList<Comment>();

    public Post(String title, String url, String author, int upvotes, int downvotes,  LocalDateTime time, List<Comment> comments) {
        this.title = title;
        this.url = url;
        this.author = author;
        this.upvotes = upvotes;
        this.downvotes = downvotes;
        this.time = time;
        this.comments = comments;
    }

    public void upVoteComment(Comment comment) {
        comment.setUpvotes(comment.getUpvotes() + 1);
        comment.setDownvotes(comment.getDownvotes() - 1);
    }

    public void downVoteComment(Comment comment) {
        comment.setUpvotes(comment.getUpvotes() - 1);
        comment.setDownvotes(comment.getDownvotes() + 1);
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getAuthor() {
        return author;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String toString() {
        return "Title: " + title + " URL: " + url + "; Author: " + author + "; Upvotes: " + upvotes + "; Downvotes: " + downvotes + "; Comments: " + comments;
}
}