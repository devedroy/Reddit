package Reddit;

import java.util.*;
import java.time.LocalDateTime; 


public class Reddit {

    List<Post> posts = new ArrayList<Post>();

    public void addPost(Post post) {
        posts.add(post);
    }
    
    public void removePost(Post post) {
        posts.remove(post);
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void upVote(Post post) {
        post.setUpvotes(post.getUpvotes() + 1);
        post.setDownvotes(post.getDownvotes() - 1);
    }

    public void downVote(Post post) {
        post.setUpvotes(post.getUpvotes() - 1);
        post.setDownvotes(post.getDownvotes() + 1);
    }

    public static LocalDateTime getTime() {
        return LocalDateTime.now();
    }
    

    public void getComments(Post post) {
        post.getComments();
    }

    public void upVoteComment(Comment comment) {
        comment.setUpvotes(comment.getUpvotes() + 1);
        comment.setDownvotes(comment.getDownvotes() - 1);
    }

    public void downVoteComment(Comment comment) {
        comment.setUpvotes(comment.getUpvotes() - 1);
        comment.setDownvotes(comment.getDownvotes() + 1);
    }

    public void upVoteReply(Comment reply) {
        reply.setUpvotes(reply.getUpvotes() + 1);
        reply.setDownvotes(reply.getDownvotes() - 1);
    }

    public void downVoteReply(Comment reply) {
        reply.setUpvotes(reply.getUpvotes() - 1);
        reply.setDownvotes(reply.getDownvotes() + 1);
    }


    public String toString() {
        return "Reddit{" +
                "posts=" + posts +
                '}';
    }

    public static void main(String[] args) {
        List<Comment> replies = new ArrayList<Comment>();
        Comment comment = new Comment("author", "text", 1, 1, replies);
        List<Comment> comments = new ArrayList<Comment>();
        comments.add(comment);
        Post post = new Post("title", "url", "author", 0, 0, getTime(), comments);
        Reddit reddit = new Reddit();
        reddit.addPost(post);
        System.out.println(reddit);
    }

}
