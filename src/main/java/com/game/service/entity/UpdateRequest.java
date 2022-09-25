package com.game.service.entity;

import com.game.entity.Profession;
import com.game.entity.Race;

import java.util.Objects;

public class UpdateRequest {
    String name;
    String title;
    Race race;
    Profession profession;
    Long birthday;
    Boolean banned;
    Integer experience;

    public UpdateRequest() {
    }

    public UpdateRequest(String name, String title, Race race, Profession profession, Long birthday, Boolean banned, Integer experience) {
        this.name = name;
        this.title = title;
        this.race = race;
        this.profession = profession;
        this.birthday = birthday;
        this.banned = banned;
        this.experience = experience;
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

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public Boolean getBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateRequest that = (UpdateRequest) o;
        return Objects.equals(name, that.name) && Objects.equals(title, that.title) && race == that.race && profession == that.profession && Objects.equals(birthday, that.birthday) && Objects.equals(banned, that.banned) && Objects.equals(experience, that.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, title, race, profession, birthday, banned, experience);
    }

    @Override
    public String toString() {
        return "UpdatePlayerRequest{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", race=" + race +
                ", profession=" + profession +
                ", birthday=" + birthday +
                ", banned=" + banned +
                ", experience=" + experience +
                '}';
    }
}
