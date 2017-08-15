/**
 * Created by Nanditha on 4/2/2016.
 */
import android.provider.BaseColumns;

public class datab {
    public datab(){}
    public static abstract class tabinfo implements BaseColumns {
        public static final String PLACE_NAME = "place_name";
        public static final String MONDAY = "monday";
        public static final String TUESDAY = "tuesday";
        public static final String WEDNESDAY = "wednesday";
        public static final String THURSDAY = "thursday";
        public static final String FRIDAY = "friday";
        public static final String SATURDAY = "saturday";
        public static final String SUNDAY = "sunday";
        //public static final String TIMINGS = "times";
        //public static final String STATUS = "status";
        public static final String TABLE_NAME = "TIMGINGS_TABLE";
        public static final String DATABASE_NAME = "Time_schema";


    }
}
