package design_pattern.chapter_13_visitor;

import java.util.List;
import java.util.ArrayList;

public class FileFindVisitor extends Visitor{
    private String filetype;
    private List found = new ArrayList();

    public FileFindVisitor(String filetype) {
        this.filetype = filetype;
    }

    public List<Entry> getFoundFiles() {
        return found;
    }

    public void visit(File file) {
        if (file.getName().endsWith(filetype)) {
            found.add(file);
        }
    }

    public void visit(Directory directory) {
        for (Entry entry : directory.getDir()) {
            entry.accept(this);
        }
    }
}
