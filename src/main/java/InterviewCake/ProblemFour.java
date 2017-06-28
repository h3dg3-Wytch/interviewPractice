package InterviewCake;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by rex on 6/23/17.
 */
public class ProblemFour    {

    public static void main(String[] args) {
        Meeting[] meeting =   new Meeting[]{new Meeting(0, 1), new Meeting(3, 5), new Meeting(4, 8), new Meeting(10, 12), new Meeting(9, 10)};
        List<Meeting> meetings = new ArrayList<Meeting>();

       for(Meeting meeting1 : meeting){
           meetings.add(meeting1);
       }
        List<Meeting> results = mergeRanges(meetings);
        for(Meeting meeting1 : results){
            System.out.println(meeting1.toString());
        }
    }

    //brute force
//    public static List<Meeting> mergeRanges(List<Meeting> meetings){
//
//        List<Meeting> result = new ArrayList<>();
//        for(int i = 0; i < meetings.size(); i++) {
//            Meeting meeting = meetings.get(i);
//
//            if (meeting != null) {
//                for (int j = i + 1; j < meetings.size(); j++) {
//                    Meeting nextMeeting = meetings.get(j);
//
//                    if (meeting.getEndTime() >= nextMeeting.getStartTime() && nextMeeting != null) {
//                        meeting.setEndTime(nextMeeting.getEndTime());
//                        meetings.set(j, null);
//                    }
//
//                }
//                result.add(meeting);
//            }
//        }
//        return meetings;
//    }

    public static List<Meeting> mergeRanges(List<Meeting> meetings){

        meetings.sort(new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                return o1.getStartTime() - o2.getStartTime();
            }
        });

        // initialize mergedMeetings with the earliest meeting
        List<Meeting> mergedMeetings = new ArrayList<Meeting>();
        mergedMeetings.add(meetings.get(0));

        for (Meeting currentMeeting : meetings) {

            Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);

            // if the current and last meetings overlap, use the latest end time
            if (currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()) {
                lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.endTime, currentMeeting.endTime));

                // add the current meeting since it doesn't overlap
            } else {
                mergedMeetings.add(currentMeeting);
            }
        }
        return mergedMeetings;
    }
}
