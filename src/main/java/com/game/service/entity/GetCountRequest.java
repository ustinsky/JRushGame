package com.game.service.entity;

import com.game.entity.Profession;
import com.game.entity.Race;

import java.util.GregorianCalendar;
import java.util.Objects;

public class GetCountRequest {
    String name;
    String title;
    Race race;
    Profession profession;
    Long after = new GregorianCalendar(1900,01,01).getTime().getTime();
    Long before = new GregorianCalendar(3000,01,01).getTime().getTime();;
    Boolean banned;
    Integer minExperience = 0;
    Integer maxExperience = Integer.MAX_VALUE;
    Integer minLevel = 0;
    Integer maxLevel = Integer.MAX_VALUE;

    public GetCountRequest(){

    };

    public GetCountRequest(String name, String title, Race race, Profession profession, Long after, Long before, Boolean banned, Integer minExperience, Integer maxExperience, Integer minLevel, Integer maxLevel) {
        this.name = name;
        this.title = title;
        this.race = race;
        this.profession = profession;
        this.after = after;
        this.before = before;
        this.banned = banned;
        this.minExperience = minExperience;
        this.maxExperience = maxExperience;
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Long getAfter() {
        return after;
    }

    public void setAfter(Long after) {
        this.after = after;
    }

    public Long getBefore() {
        return before;
    }

    public void setBefore(Long before) {
        this.before = before;
    }

    public Boolean getBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public Integer getMinExperience() {
        return minExperience;
    }

    public void setMinExperience(Integer minExperience) {
        this.minExperience = minExperience;
    }

    public Integer getMaxExperience() {
        return maxExperience;
    }

    public void setMaxExperience(Integer maxExperience) {
        this.maxExperience = maxExperience;
    }

    public Integer getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    public Integer getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCountRequest that = (GetCountRequest) o;
        return Objects.equals(name, that.name) && Objects.equals(title, that.title) && race == that.race && profession == that.profession && Objects.equals(after, that.after) && Objects.equals(before, that.before) && Objects.equals(banned, that.banned) && Objects.equals(minExperience, that.minExperience) && Objects.equals(maxExperience, that.maxExperience) && Objects.equals(minLevel, that.minLevel) && Objects.equals(maxLevel, that.maxLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, title, race, profession, after, before, banned, minExperience, maxExperience, minLevel, maxLevel);
    }

    @Override
    public String toString() {
        return "GetPlayerCountRequest{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", race=" + race +
                ", profession=" + profession +
                ", after=" + after +
                ", before=" + before +
                ", banned=" + banned +
                ", minExperience=" + minExperience +
                ", maxExperience=" + maxExperience +
                ", minLevel=" + minLevel +
                ", maxLevel=" + maxLevel +
                '}';
    }
}
