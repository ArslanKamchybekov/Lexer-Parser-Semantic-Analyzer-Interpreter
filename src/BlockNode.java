import java.util.List;

public class BlockNode extends ASTNode {
    List<ASTNode> statements;

    public BlockNode(List<ASTNode> statements) {
        this.statements = statements;
    }

//    @Override
//    public String toString() {
//        return "BlockNode{" +
//                "statements=" + statements +
//                '}';
//    }

    @Override
    public void print(String indent) {
        for (ASTNode node : statements) {
            System.out.print("");
            node.print("");
        }
    }
}
