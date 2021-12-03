// demonstration
// import static net.mindview.util.Print.*;

/**
 * new class
 * @author Dmitry
 * @version 1.1
 */
public class Overloading {
    /** height integer var **/
    public int height;
    /** empty method **/
    public void Tree() {
        System.out.println("planting a tree");
        height = 0;
    }
    /** @param int initialHeight */
    public void Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("creating a new tree with height " + height + "meters");
    }
    /** void method 1 */
    public void info() {
        System.out.println("The tree is " + height + " meters height");
    }
    /** void method 2 */
    public void info(String s) {
        System.out.println(s + ": tree is " + height + " meters height");
    }
}