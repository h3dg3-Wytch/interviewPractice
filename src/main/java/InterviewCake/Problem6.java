package InterviewCake;

/**
 * Created by rex on 6/24/17.
 */
public class Problem6 {

    public static class RangeOverlap{

        public static final RangeOverlap NO_OVERLAP = new RangeOverlap();

        private int startPoint;
        private int length;


        public RangeOverlap(){}

        public RangeOverlap(int startPoint, int length){

            this.startPoint = startPoint;
            this.length = length;

        }

        public int getStartPoint(){
            return startPoint;
        }

        public int getLength(){
            return length;
        }
    }


    public static RangeOverlap findRangeOverlap(int point1, int length1, int point2, int length2){

        int highestStartingPoint = Math.max(point1, point2);
        int lowestEndPoint = Math.min(point1 + length1, point2 + length2);

        if(highestStartingPoint >= lowestEndPoint){
            return RangeOverlap.NO_OVERLAP;
        }

        int overlapWidth = lowestEndPoint - highestStartingPoint;

        return new RangeOverlap(point1, overlapWidth);
    }

    public static Rectangle rectangleOverlap(Rectangle r1, Rectangle r2){

        RangeOverlap xOverlap = findRangeOverlap(r1.getLeftX(), r1.getWidth(), r2.getLeftX(), r2.getWidth());
        RangeOverlap yOverlap = findRangeOverlap(r1.getBottomY(), r1.getHeight(), r2.getBottomY(), r2.getHeight());

        if(xOverlap.getLength() != 0 && yOverlap.getLength() != 0){
            return Rectangle.NO_RECTANGLE;
        }

        return new Rectangle(xOverlap.getStartPoint(), yOverlap.getStartPoint(), xOverlap.getLength(), yOverlap. getLength());
    }


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

        @Override
        public String toString(){
            return "" + width;

        }

    }

    public static XOverlap calculateXOverlap(int x1, int width1, int x2, int width2){
        int highestStartPoint = Math.max(x1, x2);
        int lowestEndPoint = Math.min(x1 + width1, x2 + width2);

        if (highestStartPoint >= lowestEndPoint){
            return XOverlap.NO_OVERLAP;
        }
        System.out.println("Overlap detected!");
        int overlapWidth = lowestEndPoint - highestStartPoint;

        return new XOverlap(highestStartPoint, overlapWidth);
    }

    public static void main(String[] args) {

        System.out.println(calculateXOverlap(1, 2, 2, 2));

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
