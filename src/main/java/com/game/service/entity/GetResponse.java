package com.game.service.entity;

import com.game.entity.Player;
import com.game.entity.Profession;
import com.game.entity.Race;

import java.util.Objects;

public class GetResponse {
    Long id;
    String name;
    String title;
    Race race;
    Profession profession;
    Long birthday;
    Boolean banned;
    Integer experience;
    Integer level;
    Integer untilNextLevel;

    public GetResponse(Player player) {
        this.id = player.getId();
        this.name = player.getName();
        this.title = player.getTitle();
        this.race = player.getRace();
        this.profession = player.getProfession();
        this.birthday = player.getBirthday().getTime();
        this.banned = player.isBanned();
        this.experience = player.getExperience();
        this.level = player.getLevel();
        this.untilNextLevel = player.getUntilNextLevel();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getUntilNextLevel() {
        return untilNextLevel;
    }

    public void setUntilNextLevel(Integer untilNextLevel) {
        this.untilNextLevel = untilNextLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse that = (GetResponse) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(title, that.title) && race == that.race && profession == that.profession && Objects.equals(birthday, that.birthday) && Objects.equals(banned, that.banned) && Objects.equals(experience, that.experience) && Objects.equals(level, that.level) && Objects.equals(untilNextLevel, that.untilNextLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, title, race, profession, birthday, banned, experience, level, untilNextLevel);
    }

    @Override
    public String toString() {
        return "GetPlayerListResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", race=" + race +
                ", profession=" + profession +
                ", birthday=" + birthday +
                ", banned=" + banned +
                ", experience=" + experience +
                ", level=" + level +
                ", untilNextLevel=" + untilNextLevel +
                '}';
    }
}

