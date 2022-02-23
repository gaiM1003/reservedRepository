package com.example.demo.model;

import java.time.LocalDateTime;
//@Entity
//@Table(name = "reserved_table")
public class Reserved {

	//予約番号
	private long reservedId;
	//ユーザーId
	private long userId;
	//スタジオIｄ
	private long studioId;
	//予約完了日時
	private LocalDateTime reservedTime;
	//利用開始日時
	private LocalDateTime startTime;
	//利用終了日時
	private LocalDateTime endTime;
	//表示名
	private String viewName;
	
	public long getReservedId() {
		return reservedId;
	}
	public void setReservedId(long reservedId) {
		this.reservedId = reservedId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getStudioId() {
		return studioId;
	}
	public void setStudioId(long studioId) {
		this.studioId = studioId;
	}
	public LocalDateTime getReservedTime() {
		return reservedTime;
	}
	public void setReservedTime(LocalDateTime reservedTime) {
		this.reservedTime = reservedTime;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	

}
