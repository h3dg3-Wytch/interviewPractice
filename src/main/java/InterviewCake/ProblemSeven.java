package InterviewCake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rex on 6/27/17.
 */
public class ProblemSeven {

    public class TempTracker{

        public List<Integer> temps = new ArrayList<>();

        public Map<Integer, Integer> modeOfTemps = new HashMap<>();

        public int min;
        public int max;

        public int aggregateScoreOfTemps;

        public TempTracker(){
            this.min = 0;
            this.max = 0;
            this.aggregateScoreOfTemps = 0;
        }

        public int getMin(){
            return min;
        }

        public int getMax(){
            return max;
        }

        public double mean(){
            return  aggregateScoreOfTemps / temps.size();
        }

//        public List<Integer> mode(){
//            modeOfTemps.
//            List<Integer> results = new ArrayList<>();
//
//            int max = 0;
//            for(int i : modeOfTemps.keySet()){
//
//                if(max < modeOfTemps.get(i)){
//                    max = modeOfTemps.get(i);
//                }
//            }
//
//            results.add(max);
//
//            return results;
//
//        }

        public void insert(int temperature){
            this.min = Math.min(min, temperature);
            this.max = Math.max(max, temperature);
            this.aggregateScoreOfTemps += temperature;
            temps.add(temperature);

            if(!modeOfTemps.containsKey(temperature)){
                modeOfTemps.put(temperature, 1);
            }else{
                modeOfTemps.put(temperature, (modeOfTemps.get(temperature) + 1));
            }
        }
    }
}
