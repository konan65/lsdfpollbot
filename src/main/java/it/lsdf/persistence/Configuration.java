//package it.lsdf.persistence;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "CON_CONFIGURATION")
//public class Configuration {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "ID")
//	protected Long id;
//	@Column(name = "CREATED")
//	LocalDateTime created;
//	@Column(name = "CHANGED")
//	LocalDateTime updated;
//	@Column(name = "STATUS")
//	String status = "ACTIVE";
//	@Column(name = "TEAM_NAME")
//	String teamName;
//	@Column(name = "OPENING_DAY")
//	String openingDay;
//	@Column(name = "OPENING_TIME")
//	String openingTime;
//	@Column(name = "CLOSING_TIME")
//	String closingTime;
//	@Column(name = "POLL_TEST")
//	String pollText;
//
//	@PrePersist
//	protected void onCreate() {
//		created = LocalDateTime.now();
//	}
//
//	@PreUpdate
//	protected void onUpdate() {
//		updated = LocalDateTime.now();
//	}
//
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public LocalDateTime getCreated() {
//		return created;
//	}
//
//	public void setCreated(LocalDateTime created) {
//		this.created = created;
//	}
//
//	public LocalDateTime getUpdated() {
//		return updated;
//	}
//
//	public void setUpdated(LocalDateTime updated) {
//		this.updated = updated;
//	}
//
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}
//
//	public String getTeamName() {
//		return teamName;
//	}
//
//	public void setTeamName(String teamName) {
//		this.teamName = teamName;
//	}
//
//	public String getOpeningDay() {
//		return openingDay;
//	}
//
//	public void setOpeningDay(String openingDay) {
//		this.openingDay = openingDay;
//	}
//
//	public String getOpeningTime() {
//		return openingTime;
//	}
//
//	public void setOpeningTime(String openingTime) {
//		this.openingTime = openingTime;
//	}
//
//	public String getClosingTime() {
//		return closingTime;
//	}
//
//	public void setClosingTime(String closingTime) {
//		this.closingTime = closingTime;
//	}
//
//	public String getPollText() {
//		return pollText;
//	}
//
//	public void setPollText(String pollText) {
//		this.pollText = pollText;
//	}
//}
