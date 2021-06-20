package com.jiwei.headfirst.behavioral.section1_strategy.test_game;

import com.jiwei.headfirst.behavioral.section1_strategy.test_game.unchange_part.Character;
import com.jiwei.headfirst.behavioral.section1_strategy.test_game.unchange_part.*;

public class GameClient {
    public static void main(String[] args) {
        Character character1 = new King();
        Character character2 = new Queen();
        Character character3 = new Knight();
        Character character4 = new Troll();
        character1.fight();
        character2.fight();
        character3.fight();
        character4.fight();
    }
}
