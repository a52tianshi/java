package design_pattern.chapter_13_visitor;

public class ListVisitor extends Visitor {
    private String currentdir = "";

    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        for (Entry entry : directory.getDir()) {
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
