package nl.temporibus.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author kennethveenstra
 *
 */
@Entity
@Table(name = "EMPLOYEE")
public class Keyword {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String keyword;
	private String description;
	private String twitterLanguageCode = "nl";
	
	public Keyword() {
		super();
	}
	
	public Keyword(int id, String keyword, String description,
			String twitterLanguageCode) {
		super();
		this.id = id;
		this.keyword = keyword;
		this.description = description;
		this.twitterLanguageCode = twitterLanguageCode;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getKeyword() {
		return keyword;
	}
	
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getTwitterLanguageCode() {
		return twitterLanguageCode;
	}

	public void setTwitterLanguageCode(String languageCode) {
		this.twitterLanguageCode = languageCode;
	}

	@Override
	public String toString() {
		return "Keyword [keyword=" + keyword + ", languageCode=" + twitterLanguageCode
				+ "]";
	}

}
