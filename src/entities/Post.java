package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.List;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comments = new ArrayList<>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	// Formatter fmt = new Formatter(sbdr);

	// fmt.format("%s%n%d Likes -
	// %t%n%s",getTitle(),getLikes(),getMoment(),getContent());

	public Post() {

	}

	public Post(Date moment, String title, String content, Integer likes) {
		setMoment(moment);
		setTitle(title);
		setContent(content);
		setLikes(likes);
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComment() {
		return comments;
	}

	private void setComment(Comment comment) {
		comments.add(comment);
	}

	public void addComment(Comment comment) {
		setComment(comment);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	@Override
	public String toString() {
		StringBuilder sbdr = new StringBuilder();
		sbdr.append(getTitle() + "\n");
		sbdr.append(getLikes() + " Likes - ");
		sbdr.append(sdf.format(getMoment()) + "\n");
		sbdr.append(getContent() + "\n");
		sbdr.append("Comments:\n");
		for (Comment c : comments) {
			sbdr.append("  " + c.getText() + "\n");
		}
		return sbdr.toString();

	}
}
