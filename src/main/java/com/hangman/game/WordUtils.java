package com.hangman.game;

import java.util.ArrayList;
import java.util.Random;

public class WordUtils {
    public static ArrayList<String> words = new ArrayList<>();
    private static final Random RANDOM = new Random();
    private String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
    };

    static {
        words.add("shadow");
        words.add("mystery");
        words.add("journey");
        words.add("ocean");
        words.add("whisper");
        words.add("diamond");
        words.add("courage");
        words.add("galaxy");
        words.add("harmony");
        words.add("puzzle");
        words.add("zenith");
        words.add("velocity");
        words.add("liberty");
        words.add("novel");
        words.add("quartz");
        words.add("vortex");
        words.add("memento");
        words.add("wildfire");
        words.add("eclipse");
        words.add("silhouette");
        words.add("tundra");
        words.add("outback");
        words.add("vintage");
        words.add("groovy");
        words.add("zephyr");
        words.add("glimmer");
        words.add("serenity");
        words.add("destiny");
        words.add("fable");
        words.add("cascade");
        words.add("mirage");
        words.add("sprite");
        words.add("nexus");
        words.add("mystic");
        words.add("twilight");
        words.add("oracle");
        words.add("citadel");
        words.add("nebula");
        words.add("voyage");
        words.add("alchemy");
        words.add("spectrum");
        words.add("zen");
        words.add("cliff");
        words.add("relic");
        words.add("phantom");
        words.add("lantern");
        words.add("obsidian");
        words.add("haven");
        words.add("ember");
        words.add("flora");
        words.add("chisel");
        words.add("gargoyle");
        words.add("obelisk");
        words.add("riddle");
        words.add("ethereal");
        words.add("pendulum");
        words.add("aura");
        words.add("abyss");
        words.add("halcyon");
        words.add("labyrinth");
        words.add("quiver");
        words.add("enigma");
        words.add("sapphire");
        words.add("oracle");
        words.add("paradox");
        words.add("talisman");
        words.add("summit");
        words.add("crystal");
        words.add("maestro");
        words.add("canopy");
        words.add("glacier");
        words.add("carousel");
        words.add("chimera");
        words.add("gale");
        words.add("acumen");
        words.add("bazaar");
        words.add("monolith");
        words.add("torrent");
        words.add("prism");
        words.add("lore");
        words.add("shard");
        words.add("typhoon");
        words.add("evoke");
        words.add("whirlwind");
        words.add("phantasm");
        words.add("fragrance");
        words.add("spire");
        words.add("solstice");
        words.add("palindrome");
        words.add("decipher");
        words.add("equinox");
        words.add("saga");
        words.add("amulet");
        words.add("pyramid");
        words.add("crescent");
    }

    public static String generateWord() {
        return words.get(RANDOM.nextInt(words.size()));
    }
}
