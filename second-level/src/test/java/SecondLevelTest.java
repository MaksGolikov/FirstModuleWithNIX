
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondLevelTest {

    @Test
    public void stringLogic() {
        assertEquals("It is correct string", new SecondLevel().stringLogic("(([]{}))"));
        assertEquals("It is correct string", new SecondLevel().stringLogic(""));
        assertEquals("This string - ()] - incorrect!", new SecondLevel().stringLogic("()]"));
        assertEquals("This string - jk vljsdv - incorrect!", new SecondLevel().stringLogic("jk vljsdv"));
    }

    @Test
    public void depthOfBinaryTree() {
        TreeNode root = new TreeNode(20,
                new TreeNode(7, new TreeNode(4, null, new TreeNode(6)), new TreeNode(9)),
                new TreeNode(35,
                        new TreeNode(31, new TreeNode(28), null),
                        new TreeNode(40, new TreeNode(38), new TreeNode(52))));
        assertEquals(4, new SecondLevel().depthOfBinaryTree(root));
    }
}
