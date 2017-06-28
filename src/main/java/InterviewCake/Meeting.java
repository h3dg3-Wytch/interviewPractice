package InterviewCake;

/**
 * Created by rex on 6/23/17.
 */
public class Meeting{


        public int startTime;
        public int endTime;

        public Meeting(int startTime, int endTime) {
            // number of 30 min blocks past 9:00 am
            this.startTime = startTime;
            this.endTime   = endTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }

        @Override
        public String toString(){ return "Start Time: " + startTime + " End Time: " + endTime; }
}
