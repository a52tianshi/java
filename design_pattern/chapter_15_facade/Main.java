package design_pattern.chapter_15_facade;

import design_pattern.chapter_15_facade.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("aws@flg.com", "welcome.html");
    }
}
