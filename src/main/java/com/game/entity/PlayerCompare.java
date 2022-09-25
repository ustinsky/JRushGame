package com.game.entity;

import java.util.Comparator;

public class PlayerCompare {
    public static class CompareByExperience implements Comparator<Player> {
        @Override
        public int compare(Player o1, Player o2) {
            return o1.getExperience()-o2.getExperience();
        }
    }

    public static class CompareById implements Comparator<Player> {
        @Override
        public int compare(Player o1, Player o2) {
            return (int) (o1.getId() - o2.getId());
        }
    }

    public static class CompareByName implements Comparator<Player> {
        @Override
        public int compare(Player o1, Player o2) {
            return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
        }
    }

    public static class CompareByBirthday implements Comparator<Player> {
        @Override
        public int compare(Player o1, Player o2) {
            long milliseconds = o1.getBirthday().getTime()-o2.getBirthday().getTime();
            int result = 0;

            if (milliseconds > 0){
                result = 1;
            }else if(milliseconds < 0){
                result = -1;
            }

            return result;
        }
    }
}
