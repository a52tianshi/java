package design_pattern.chapter_12_decorator;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 = new SideBorder(
            new FullBorder(
                new FullBorder(
                    new SideBorder(
                        new FullBorder(
                            new StringDisplay("Hello, world.")
                        ),
                        '*'
                    )
                )
            ),
            '/'
        );
        b4.show();

        Display b5 = new FullBorder(
            new UpDownBorder(
                new SideBorder(
                    new UpDownBorder(
                        new SideBorder(
                            new StringDisplay("Hello, world."),
                            '*'
                        ),
                        '='
                    ),
                    '|'
                ),
                '/'
            )
        );
        b5.show();


        MultiStringDisplay md = new MultiStringDisplay();
        md.add("Good morning.");
        md.add("Good afternoon.");
        md.add("Good night.");
        md.show();

        Display d6 = new SideBorder(md, '#');
        d6.show();
        Display d7 = new FullBorder(md);
        d7.show();
    }
    //decorator pattern 的缺点是，如果要增加新的功能，需要增加新的类，会增加很多很小的类
}
