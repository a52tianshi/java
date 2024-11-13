package design_pattern.chapter_13_visitor;

public class Main {
    public static void main(String[] args) {
        try {
            Directory root1 = new Directory("root1");
            root1.add(new File("diary.html", 100));
            root1.add(new File("index.html", 200));

            Directory root2 = new Directory("root2");
            root2.add(new File("diary.html", 100));
            root2.add(new File("index.html", 200));

            ElementArrayList list = new ElementArrayList();
            list.add(root1);
            list.add(root2);
            list.add(new File("etc.html", 123));
            list.accept(new ListVisitor());

            return;
        }catch (FileTreatmentException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));
            rootdir.accept(new ListVisitor());

            System.out.println("");
            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 200));
            hanako.add(new File("memo.tex", 300));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));
            rootdir.accept(new ListVisitor());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }



        //exercise 13-1
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));
            rootdir.accept(new ListVisitor());

            System.out.println("");
            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 200));
            hanako.add(new File("memo.tex", 300));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));
            tomura.add(new File("cqtest.java", 890));
            rootdir.accept(new ListVisitor());

            System.out.println("");
            System.out.println("File search...");
            FileFindVisitor ffv = new FileFindVisitor(".java");
            rootdir.accept(ffv);
            System.out.println("HTML files are:");
            for (Entry entry : ffv.getFoundFiles()) {
                System.out.println(entry.toString());
            }
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }

        //为什么java不支持多继承，因为多继承会导致类之间的关系复杂化，增加了系统的复杂性，而且会导致多个父类中有相同的方法，导致方法调用的不确定性。
        //为什么java支持多态，因为多态可以使程序更加灵活，可以根据不同的对象调用不同的方法，而不需要知道对象的具体类型。
        //为什么java的String类是final的，因为String类是不可变的，如果String类不是final的，那么子类可以修改String类的方法，导致String类的不可变性失效。
        // 这样违背了开闭原则，所以String类是final的。为什么java的包装类是final的，因为包装类是不可变的，如果包装类不是final的，那么子类可以修改包装类的方法，导致包装类的不可变性失效。
    }
}
