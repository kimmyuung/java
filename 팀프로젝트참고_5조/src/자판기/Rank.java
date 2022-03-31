package ÀÚÆÇ±â;

public class Rank {
	
	private String name ;
	private long playtime ;
	private String content ; 
	
	public Rank() {
	}

	public Rank(String name, long playtime, String content) {
		super();
		this.name = name;
		this.playtime = playtime;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPlaytime() {
		return playtime;
	}

	public void setPlaytime(long playtime) {
		this.playtime = playtime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	
	
}