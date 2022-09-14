package Reddit;

import java.util.*;

public class Comment {
    String author;
    String text;
    int upvotes;
    int downvotes;
    List<Comment> replies = new ArrayList<Comment>();

    public Comment(String author, String text, int upvotes, int downvotes, List<Comment> replies) {
        this.author = author;
        this.text = text;
        this.upvotes = upvotes;
        this.downvotes = downvotes;
        this.replies = replies;
    }

    public void upVoteReply(Comment reply) {
        reply.setUpvotes(reply.getUpvotes() + 1);
        reply.setDownvotes(reply.getDownvotes() - 1);
    }

    public void downVoteReply(Comment reply) {
        reply.setUpvotes(reply.getUpvotes() - 1);
        reply.setDownvotes(reply.getDownvotes() + 1);
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public List<Comment> getReplies() {
        return replies;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }

    public void setReplies(List<Comment> replies) {
        this.replies = replies;
    }

    public String toString() {
        return "Author: " + author + "; Text: " + text + "; Upvotes: " + upvotes + "; Downvotes: " + downvotes + "; Replies: " + replies;
    }

}
