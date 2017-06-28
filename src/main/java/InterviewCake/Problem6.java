package InterviewCake;

/**
 * Created by rex on 6/24/17.
 */
public class Problem6 {



    public static class XOverlap{
        public static final XOverlap NO_OVERLAP = new XOverlap();

        private int startPoint;
        private int width;

        public XOverlap(){}

        public XOverlap(int startPoint, int width){
            this.startPoint = startPoint;
            this.width = width;
        }

        public int getStartPoint(){
            return startPoint;
        }

        public int getWidth(){
            return width;
        }
    }

    public static XOverlap findXOverlap(int x1, int width1, int x2, int width2) {

        int highestStartPoint = Math.max(x1, x2);
        int lowestEndPoint = Math.min(x1 + width1, x2 + width2);

        if(highestStartPoint >= lowestEndPoint){
            return XOverlap.NO_OVERLAP;
        }

        int overlapWidth = lowestEndPoint - highestStartPoint;

        return new XOverlap(highestStartPoint, overlapWidth);
    }
    public static class Rectangle {

        // "zero" rectangle
        public static final Rectangle NO_RECTANGLE = new Rectangle();

        // coordinates of bottom left corner
        private int leftX;
        private int bottomY;

        // dimensions
        private int width;
        private int height;

        public Rectangle() {}

        public Rectangle(int leftX, int bottomY, int width, int height) {
            this.leftX = leftX;
            this.bottomY = bottomY;
            this.width  = width;
            this.height = height;
        }

        public int getLeftX() {
            return leftX;
        }

        public int getBottomY() {
            return bottomY;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }
    }

}
